FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=/home/runner/work/reference-application-sample-log/reference-application-sample-log/build/libs/spring-music.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
