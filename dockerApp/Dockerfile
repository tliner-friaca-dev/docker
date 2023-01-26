FROM openjdk

WORKDIR /app

COPY target/dockerApp-0.0.1-SNAPSHOT.jar /app/spring-app.jar

ENTRYPOINT ["java", "-jar", "/app/spring-app.jar"]