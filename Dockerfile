FROM openjdk:8
ADD target/SampleDocker-0.0.1-SNAPSHOT.jar SampleDocker-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","SampleDocker-0.0.1-SNAPSHOT.jar"]