FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} TrainDetection-0.0.1-SNAPSHOT.jar
EXPOSE 1124
ENTRYPOINT ["java","-jar","TrainDetection-0.0.1-SNAPSHOT.jar"]