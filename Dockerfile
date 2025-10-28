FROM eclipse-temurin:25-jdk

WORKDIR /app
COPY . .

# 🔧 Corrige a permissão do script mvnw
RUN chmod +x mvnw

# 🔨 Compila o projeto sem rodar os testes
RUN ./mvnw clean package -DskipTests

# 🚀 Inicia o app Spring Boot
CMD ["java", "-jar", "target/langchain4j-0.0.1-SNAPSHOT.jar"]
