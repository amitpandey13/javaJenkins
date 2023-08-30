FROM openjdk:8
EXPOSE 8080
ADD spring-boot-security-learn/target/spring-boot-security-learn.jar spring-boot-security-learn.jar
ENTRYPOINT ["java","-jar","/spring-boot-security-learn.jar"]