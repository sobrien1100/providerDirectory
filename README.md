# providerDirectory Spring Boot API 



## How-To

This program exposes 3 request URLs which retrieve data from a MySQL database.   

## Prerequisites
Must have a running version of MySQL installed on your computer. <br>
Ability to run JAR files or JDK to compile Java code is also required. 

The following parameters relating to the datasources need to be added in the application.properties file
~~~
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
~~~

The following SQL can be run in the MYSql DB of you choosing to create the necessary data to run this application
~~~
CREATE TABLE `provider` (
  `PROVIDER_ID` int NOT NULL,
  `FIRST_NAME` varchar(45) DEFAULT NULL,
  `LAST_NAME` varchar(45) DEFAULT NULL,
  `EMAIL_ADDRESS` varchar(45) DEFAULT NULL,
  `SPECIALTY` varchar(45) DEFAULT NULL,
  `PRACTICE_NAME` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`PROVIDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
~~~

The Included ProviderData.json file can be used to recreate the data needed in the provider table

### Testability

