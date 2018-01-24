# springboot-profile-experiment
# run springboot application with profile specified in pom.xml
mvn spring-boot:run -Pdev



# Build and run executable jar with properties
or run application with detaul.properties inside src/resource/config/default.properties
java -jar /path/application.jar --spring.config.location=classpath:/config/default.properties