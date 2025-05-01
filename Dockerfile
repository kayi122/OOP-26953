# Use official OpenJDK image
FROM eclipse-temurin:21-jdk-jammy

# Set working directory
WORKDIR /app

# Copy all source files
COPY . .

# Compile all Java classes (all three modules)
RUN mkdir -p out \
    && find HotelManagement -name "*.java" > sources.txt \
    && find siteConstruction -name "*.java" >> sources.txt \
    && find TrafficFineManagement -name "*.java" >> sources.txt \
    && javac -d out @sources.txt

# Set default command to run HotelManagement
CMD ["java", "-cp", "out", "HotelManagement.Main"]