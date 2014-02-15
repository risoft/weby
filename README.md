***Support Note:***

***All inquiries addressed within 12 hours.***

***Fixes and new releases usually within 48 hours. (Feb 16 2014)***

-------------------------------------------------

***Out of the box Oracle support***
 
Read More: https://github.com/risoft/weby/wiki/Oracle-Support ***(Feb 9 2014)***

----------------------------------------

Create a skeleton for your maven + spring-mvc + hibernate web project.

*The 5 minutes promise*: 5 minutes and you can start coding.

No downloads, no configuration, no settings, no boilerplate. Enjoy!

**For the impatient**

***1 Create Project***

Execute:

`mvn archetype:generate -DarchetypeGroupId=com.highwise -DarchetypeArtifactId=weby -DinteractiveMode=false -Dversion=1.0-SNAPSHOT -DgroupId=com.yourcompany -DartifactId=yourprojectname`

Maven will create a directory called `yourprojectname`.

***2 See it working***

Execute:

`cd yourprojectname`

`mvn tomcat:run`

Open in your browser:

`http://localhost:8080/yourprojectname`

***3 Start coding***

Execute:

`mvn eclipse:eclipse -Dwtpversion=1.5`

In Eclipse, do: File &#8594;Import &#8594; Existing Project into Workspace.

Browse to the location of the yourprojectname directory and import it. 

**Start programming!**

