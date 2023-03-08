FROM openjdk:17-slim

ADD target/SampleCode-1.0.jar /opt/sw/sample-project.jar

EXPOSE 8080
CMD ["java", "-Xms512m", "-Xmx512m", "-jar", "/opt/sw/sample-project.jar"]
