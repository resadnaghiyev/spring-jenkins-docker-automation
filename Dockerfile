FROM openjdk:11
EXPOSE 8080
ADD target/spring-jenkins-docker-automation.jar spring-jenkins-docker-automation.jar
ENTRYPOINT ["java","-jar","/spring-jenkins-docker-automation.jar"]