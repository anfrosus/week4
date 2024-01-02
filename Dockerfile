FROM eclipse-temurin:21-jre

WORKDIR /app

COPY ./build/libs/redis-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "redis-0.0.1-SNAPSHOT.jar"]