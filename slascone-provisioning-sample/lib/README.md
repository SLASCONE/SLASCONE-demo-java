# Library Directory

This directory is intentionally kept empty. All dependencies are managed through Maven as specified in the project's `pom.xml` file.

Previously, this directory contained JAR files that were redundant with the Maven dependencies. Those files have been removed to:
1. Reduce repository size
2. Avoid maintenance issues with duplicate dependency definitions
3. Follow best practices for Java dependency management

If you need any of these libraries, they will be automatically downloaded by Maven when you build the project:

```bash
mvn clean compile
```
