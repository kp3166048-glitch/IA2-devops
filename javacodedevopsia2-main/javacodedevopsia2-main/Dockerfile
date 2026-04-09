# Use Java 17 JDK
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy Java file
COPY Grade.java .

# Compile Java
RUN javac Grade.java

# Run the program
CMD ["java", "Grade"]
