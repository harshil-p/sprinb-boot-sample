# spring-boot-sample

Spring Boot based RESTful example. Also see (https://spring.io/guides/gs/spring-boot/)

# Requirements

* JDK 1.8
* Maven version: 3.3.3 (Please double check Maven .m2/settings.xml)

# Build and deploy
Step 1: Clone project from git using: https://github.com/harshil-p/spring-boot-sample.git

Step 2: Navigate to project directory and run command: mvn clean install

Step 3: Simply right-click on SpringBootSampleApplication.java and Run it as Spring Boot App. This will start embedded tomcat server and run the application on top of it

# Browser
Once server is up, hit below link in browser,

http://localhost:9090/springbootsample/participant/get

As a result, it will display sample JSON response on browser
