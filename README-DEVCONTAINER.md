# SLASCONE Java Demo in Dev Container

This project demonstrates the SLASCONE licensing API usage in Java. It's configured to run in a Visual Studio Code Dev Container for consistent development environments across all machines.

## Using the Dev Container

1. Make sure you have Docker installed on your machine
2. Install the "Dev Containers" extension in VS Code
3. Open this project in VS Code
4. Click on the green icon in the bottom-left corner (or press F1 and select "Dev Containers: Reopen in Container")
5. VS Code will build and open the project in a container with all necessary dependencies

## Building and Running the Project

Once inside the dev container, you can build and run the project using Maven:

```bash
# Build the project
mvn compile

# Run the project
mvn exec:java
```

## Project Structure

- `src/` - Contains all Java source files
  - `Model/` - Data models for the SLASCONE API
  - `Program/` - Main program and helper classes
  - `Proxy/` - API proxy for communication with SLASCONE

## Dependencies

All dependencies are managed through Maven in the `pom.xml` file, including:
- Apache HTTP Client
- Apache Commons Codec
- Jackson (JSON/XML processing)
- Gson

## Switching from Local Build to Maven

This project was originally built using local JAR files and custom tasks. The Dev Container setup uses Maven for dependency management, which simplifies the build process and ensures consistency.
