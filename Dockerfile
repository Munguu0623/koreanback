FROM openjdk:17-jdk-slim

WORKDIR /app

VOLUME /tmp

COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

RUN chmod +x app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
