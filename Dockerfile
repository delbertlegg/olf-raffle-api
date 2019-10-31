FROM openjdk:11 as build
WORKDIR /app
COPY . .

EXPOSE 8080

ENTRYPOINT ["./gradlew", "bootRun"]
