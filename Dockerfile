# Description: Dockerfile for building the application

FROM maven:latest

# Set the working directory in the container to /app directory
WORKDIR /app

# Copy the pom.xml file to the container at /app directory
COPY . /app/

# Build the application using maven package command
RUN mvn package
