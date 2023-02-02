FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ENV DB_NAME=db_nctr \
    MY_SQL_DB_HOST=host.docker.internal \
    MY_SQL_DB_PORT=3306 \
    MY_SQL_PASSWORD=appuser \
    MY_SQL_USERNAME=AppUser \
    TEST_APP_NAME=hello
COPY target/Oshare249-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]