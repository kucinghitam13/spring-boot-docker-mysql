FROM openjdk:8
#ADD build/libs/spring-boot-docker-0.0.1-SNAPSHOT.jar asdf.jar
WORKDIR /app
COPY . /app
EXPOSE 8085
#ENTRYPOINT  ["java", "-jar", "asdf.jar"]
ENTRYPOINT ["./gradlew", "bootRun"]
