FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY pom.xml .
COPY src ./src
COPY data.csv .

RUN apt-get update && apt-get install -y maven

RUN mvn -q -DskipTests package

CMD ["java", "-cp", "target/csv-app-1.0-SNAPSHOT.jar", "com.example.App"]
