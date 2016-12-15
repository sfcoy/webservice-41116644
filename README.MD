Example of a Java EE 7 JAX-WS web service implemented as a SLSB with a dependent EJB service and deployed in a WAR file.

Features the injection via `@EJB` of a supplementary service.

The branch `ejb-jar-module-in-web-module` moves all the code into an EJB jar which is then added to the `WEB-INF/lib`
 directory of the WAR file.
 
These implementations were tested in JBoss EAP 6.4,

