FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/dragonfly95-0.0.1-SNAPSHOT.war
ADD ${JAR_FILE} app.war

EXPOSE 5000
ENTRYPOINT ["java","-jar","/app.war"]