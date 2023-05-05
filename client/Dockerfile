FROM maven:3-openjdk-17-slim AS build
WORKDIR /home/app
COPY src/ /home/app/src
COPY pom.xml /home/app/pom.xml
RUN mvn clean package

##
FROM openjdk:17-jdk-alpine AS run
ENV SERVER_PORT=8080
ARG JAR_FILE=target/client-jar-with-dependencies.jar
ARG PATH=/usr/local/lib
COPY --from=build /home/app/${JAR_FILE} ${PATH}/client.jar
WORKDIR ${PATH}
ENTRYPOINT ["java", "-jar", "/usr/local/lib/client.jar"]