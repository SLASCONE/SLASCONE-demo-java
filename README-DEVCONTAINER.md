# SLASCONE Java Demo in Dev Container

This project demonstrates the SLASCONE licensing API usage in Java. It's configured to run in a Visual Studio Code Dev Container for consistent development environments across all machines.

## Using the Dev Container

1. Make sure you have Docker installed on your machine
2. Install the "Dev Containers" extension in VS Code
3. Open this project in VS Code
4. Click on the green icon in the bottom-left corner (or press F1 and select "Dev Containers: Reopen in Container")
5. VS Code will build and open the project in a container with all necessary dependencies

## Project Structure

This is a multi-module Maven project with the following structure:

- `slascone-provisioning-sample/` - The main application module
  - `src/`
    - `Model/` - Data models specific to the sample application
    - `Program/` - Main program and helper classes
- `slascone-client/` - Generated API client for SLASCONE services
  - Contains auto-generated API clients for interacting with SLASCONE services

## Building and Running the Project

Once inside the dev container, you can build and run the project using Maven:

```bash
# Build the entire project
mvn clean package

# Run the application using the convenience script
./run.sh

# Alternatively, navigate to the sample project directory and run it directly
cd slascone-provisioning-sample
mvn exec:java
```

## Dependencies

All dependencies are managed through Maven in the `pom.xml` files, including:
- Apache HTTP Client
- Apache Commons Codec
- Jackson (JSON/XML processing)
- Gson

The project uses a parent-child structure where common dependencies are defined in the root pom.xml.
