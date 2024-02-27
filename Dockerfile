FROM openjdk:18
COPY ./build/libs/profileService-0.0.1-SNAPSHOT.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "/tmp/profileService-0.0.1-SNAPSHOT.jar"]
