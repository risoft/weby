package ${groupId}.${artifactId}.service;

import java.util.logging.Logger;

import org.apache.commons.lang.RandomStringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${groupId}.${artifactId}.model.Authority;
import ${groupId}.${artifactId}.model.User;

@Service
public class RootUserCreatorService implements InitializingBean {
	
	private static final Logger logger = Logger.getLogger(RootUserCreatorService.class.getName());

	@Autowired
	private SessionFactory sessionFactory;
	
	public void afterPropertiesSet() throws Exception {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		long usersCount = (Long)s.createQuery("select count(*) from User")
			.uniqueResult();
		logger.info("There are currently "+usersCount+" users in the system");
		if (usersCount == 0)
		{
			logger.info("Creating admin user");
			User u = new User();
			u.setPassword(RandomStringUtils.randomAlphanumeric(10));
			u.setUsername("admin");
			u.setEnabled(true);
			
			Authority authority = new Authority();
			authority.setAuthority("ROLE_USER");
			authority.setUser(u);
			
			s.save(u);
			s.save(authority);
			
			System.out.println("===================================================================");
			System.out.println();System.out.println();System.out.println();
			System.out.println("CREATED FIRST USER");
			System.out.println("\tUsername: "+u.getUsername());
			System.out.println("\tPassword: "+u.getPassword());
			System.out.println();System.out.println();System.out.println();
			System.out.println("===================================================================");
		}
		tx.commit();
		s.close();
	}
}
