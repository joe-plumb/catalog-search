FROM java:8-jre
EXPOSE 8080
ADD ./target/catalog-search-0.0.1-SNAPSHOT.jar app.jar
ADD ./src/main/resources/application.properties application.properties
RUN apt-get update -y && \
    apt-get upgrade -y
ENTRYPOINT ["java", "-jar", "app.jar"]