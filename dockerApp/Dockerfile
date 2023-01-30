FROM openjdk

WORKDIR /app

COPY target/dockerApp-0.0.1-SNAPSHOT.jar /app/docker-app.jar

ENTRYPOINT ["java", "-jar", "/app/docker-app.jar"]