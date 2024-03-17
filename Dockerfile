FROM eclipse-temurin:17-jdk-alpine
FROM maven
VOLUME /tmp
ENTRYPOINT ["mvn","clean","install"]
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
