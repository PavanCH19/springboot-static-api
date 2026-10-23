# Spring Boot Static API

This project is a simple Spring Boot application that exposes one GET API returning static user data.

## Run locally

```bash
mvn spring-boot:run
```

Then open:

```text
http://localhost:8080/api/users
```

## Build jar

```bash
mvn clean package
```

## Docker

```bash
docker build -t springboot-static-api .
docker run -p 8080:8080 springboot-static-api
```
