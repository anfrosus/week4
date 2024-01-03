#FROM eclipse-temurin:21-jre
#
#WORKDIR /app
#
#COPY ./build/libs/redis-0.0.1-SNAPSHOT.jar /app
#
#EXPOSE 8080
#
#CMD ["java", "-jar", "redis-0.0.1-SNAPSHOT.jar"]

#BUILD
FROM gradle:8.5-jdk21-alpine AS builder

WORKDIR /app

COPY ./ ./

RUN gradle clean bootJar

#APP
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY --from=builder /app/build/libs/redis-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "redis-0.0.1-SNAPSHOT.jar"]


#changes123