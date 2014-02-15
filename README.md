Create a skeleton for your maven + spring-mvc + hibernate web project.

The 5 minutes promise: 5 minutes and you can start coding.

No downloads, no configuration, no settings, no boilerplate. Enjoy!

**For the impatient**

***1 Create archetype***

Execute:

`mvn archetype:generate -DarchetypeGroupId=com.highwise`
`-DarchetypeArtifactId=weby -DgroupId=com.yourcompany -DartifactId=yourprojectname `
`-Dversion=1.0-SNAPSHOT -DinteractiveMode=false`

Maven will create a directory called yourprojectname.

***2 See it working***

Execute:
`mvn tomcat:run`

Open in your browser:
`http://localhost:8080/yourprojectname

***3 Start coding***
Execute:
`mvn eclipse:eclipse -Dwtpversion=1.5`

In Eclipse, do: File --> Import --> Existing Project into Workspace.

Browse to the location of the yourprojectname directory and import it.
