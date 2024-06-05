FROM ubuntu:latest
RUN apt update && \
    apt install openjdk-17-jdk -y && \
    apt install maven -y
COPY . .
RUN mvn clean package -DskipTests
ENTRYPOINT java -jar /target/keycloak-ldap-auth-0.0.1-SNAPSHOT.jar

