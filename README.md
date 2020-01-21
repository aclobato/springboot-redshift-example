# Using Spring Data JPA with Redshift

In pom.xml

```xml
<dependency>
  <groupId>com.amazon.redshift</groupId>
	<artifactId>redshift-jdbc42-no-awssdk</artifactId>
	<version>1.2.10.1009</version>
</dependency>
```

In application.properties

```properties
spring.datasource.driverClassName = com.amazon.redshift.jdbc.Driver
spring.datasource.url=jdbc:redshift://endpoint:port/database
spring.datasource.username=username
spring.datasource.password=***

spring.jpa.show-sql = true
spring.jpa.properties.hibernate.dialect=com.example.redshift.config.CustomRedshiftDialect
```
As Redshift is based on Postgres, we use a custom dialect based on a postgres dialect, but we override the getQuerySequencesString method since Redshift does not support this type of query (select * from information_schema.sequences).

```java
public class CustomRedshiftDialect  extends PostgreSQL81Dialect {
    @Override
    public String getQuerySequencesString() {
        return null;
    }
}
```
