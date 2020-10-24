FROM openjdk:8-jdk-alpine
COPY target/helloworld-0.0.1.jar /helloworld.jar
CMD ["java","-jar","/helloworld.jar","--server.port=8089"]
EXPOSE 8089
