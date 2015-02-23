# *${groupId}:${projectId}:${version}*

Maven test project for both Dropwizard embedded and Tomcat standalone Java 1.7+ applications showing how to setup servlets, Jersey (client and server), JDBC, Metrics and Apache HTTP Client. Tomcat 7/8 standalone deployments are managed through Cargo.

## Getting started

```
mvn -Ptomcat7x dependency:properties clean verify
mvn -Ptomcat7x dependency:properties package cargo:run # CTRL+C to stop
mvn -Ptomcat8x dependency:properties clean verify
mvn -Ptomcat8x dependency:properties package cargo:run # CTRL+C to stop
mvn -Pdropwizard dependency:properties clean compile exec:exec # CTRL+C to stop
```

The result of cargo deployments can be inspected in `target/cargo/configurations`.
