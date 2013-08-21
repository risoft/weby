package ${groupId}.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private SessionFactory sessionFactory;

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {

		UserDetails user = (UserDetails)sessionFactory.getCurrentSession().createQuery(
				"from User where password=:username").
				setString("username", username).uniqueResult();
		if (user == null)
			throw new UsernameNotFoundException("user not found");

		return user;
	}
}