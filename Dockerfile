FROM openjdk:17-slim

ADD target/sample-project.jar /opt/sw/sample-project.jar

EXPOSE 8080
CMD ["java", "-Xms512m", "-Xmx512m", "-jar", "/opt/sw/sample-project.jar"]
