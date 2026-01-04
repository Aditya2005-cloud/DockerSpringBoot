FROM eclipse-temurin:25

LABEL mentainer="nnproject691@gmail.com"

WORKDIR /app

COPY target/DockerSpringBoot-0.0.1-SNAPSHOT.jar /app/dockernew.jar

ENTRYPOINT ["java", "-jar", "dockernew.jar"]