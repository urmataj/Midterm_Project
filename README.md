## Task Manager Application

This repository contains the code for a Task Manager application developed using Spring Boot and Hibernate. The application allows users to manage tasks and users, providing endpoints for CRUD operations.

### Features

- Create, read, update, and delete tasks
- Create, read, update, and delete users
- Exception handling for resource not found errors
- Unit tests and integration tests for controllers, services, and repositories
- API documentation using Swagger UI

### Technologies Used

- Java
- Spring Boot
- Hibernate
- H2 Database (for development)
- PostgreSQL (for production)
- Swagger UI
- JUnit
- Mockito

### Project Structure

- `src/main/java/org/example/taskmanager/entities`: Contains the entity classes representing tasks and users.
- `src/main/java/org/example/taskmanager/repositories`: Contains the repository interfaces for tasks and users.
- `src/main/java/org/example/taskmanager/services`: Contains the service classes for tasks and users.
- `src/main/java/org/example/taskmanager/controllers`: Contains the controller classes for tasks and users.
- `src/main/java/org/example/taskmanager/mappers`: Contains the mapper classes for converting between entities and DTOs.
- `src/main/java/org/example/taskmanager/dtos`: Contains the DTO classes for tasks and users.
- `src/main/java/org/example/taskmanager/exceptions`: Contains custom exception classes.
- `src/main/java/org/example/taskmanager/configurations`: Contains configuration classes, such as Swagger configuration.
- `src/test/java/org/example/taskmanager`: Contains the unit and integration test classes.
