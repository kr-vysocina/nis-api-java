# Self-contained build+run image for the NIS API v11 mock service.
#
# Usage:
#   docker build -t nis-api-java .
#   docker run --rm -p 8080:8080 nis-api-java
#
# Then:
#   - Swagger UI:     http://localhost:8080/nis-api-v11-service/
#   - OpenAPI doc:    http://localhost:8080/nis-api-v11-service/rest/openapi.json
#   - sayHello.xml:   http://localhost:8080/nis-api-v11-service/rest/api/nixzd/v11/sayHello.xml
#
# --- Build stage: compiles the whole Maven reactor and produces the deployable WAR ---
# (needs network access during build: Maven Central for dependencies, GitHub for the swagger-ui download)
FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /build
COPY . .

RUN mvn -B -q clean install

# --- Runtime stage: Tomcat 10.1 (Jakarta EE 10 / Servlet 6.0), matching the jakarta.* namespace ---
FROM tomcat:10.1-jdk17-temurin

COPY --from=build /build/cz.kr_vysocina.nis.v11.service/target/nis-api-v11-service.war /usr/local/tomcat/webapps/nis-api-v11-service.war

EXPOSE 8080
