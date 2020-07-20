FROM openjdk:8
MAINTAINER ravikmr.ind@gmail.com
WORKDIR /usr/src/myapp
COPY /build/libs/spring-boot-docker-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar", "spring-boot-docker-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080