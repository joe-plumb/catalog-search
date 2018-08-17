FROM openjdk:8-jre-slim
EXPOSE 8080
ADD ./target/catalog-search-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]