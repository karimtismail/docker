FROM maven:3-openjdk-17-slim AS build
WORKDIR /home/app
COPY src/ /home/app/src
COPY pom.xml /home/app/pom.xml
RUN mvn clean package

# Run stage
FROM openjdk:17-jdk-alpine AS run
ARG JAR_FILE=target/server.jar
ARG PATH=/usr/local/lib
COPY --from=build /home/app/${JAR_FILE} ${PATH}/server.jar
WORKDIR ${PATH}
ENTRYPOINT ["java" , "-jar" ,"server.jar"]