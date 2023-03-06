FROM openjdk:17-slim

ADD sample-project.jar /opt/sw/sample-project.jar

CMD ["java", "-Xms512m", "-Xmx512m", "-jar", "/opt/sw/sample-project.jar"]
