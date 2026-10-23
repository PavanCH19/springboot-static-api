# syntax=docker/dockerfile:1
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN ./gradlew build --no-daemon
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "build/libs/springboot-static-api-0.0.1-SNAPSHOT.jar"]
