FROM maven:3-openjdk-17-slim as build
COPY . /app/project
RUN mvn -f /app/project/pom.xml clean package



FROM openjdk:17-jdk-alpine
#COPY target/demo-1.0.jar app/service.jar
ARG arg=default_value
ENV env=${arg}
EXPOSE 8082
COPY --from=build /app/project/target/*.jar app/service.jar
WORKDIR app
ENTRYPOINT ["java","-jar","service.jar"]
