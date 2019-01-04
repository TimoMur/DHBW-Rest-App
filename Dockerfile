FROM openjdk:8-jre-alpine
COPY target/RestApp-0.0.1-SNAPSHOT.jar /app.jar
CMD ["/usr/bin/java", "-jar", "/app.jar"]