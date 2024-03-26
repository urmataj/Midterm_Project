# Task Manager Application

This is a Task Manager application built with Spring Boot. 
It allows users to manage tasks and users, 
providing CRUD operations for both entities.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Testing](#testing)
- [Deployment](#deployment)
- [Built With](#built-with)
- [Authors](#authors)
- [License](#license)

## Features

- CRUD operations for tasks and users
- Exception handling for resource not found
- Validation for input data
- Integration with H2 database for development and PostgreSQL for production

## Getting Started

### Prerequisites

- Java 11
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository:

   git clone https://github.com/your-username/task-manager.git

2. Navigate to the project directory:

   cd task-manager


3. Build the project:

   mvn clean install


## Usage

1. Start the application:

   mvn spring-boot:run

2. Open a web browser and go to [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to access the Swagger UI for API documentation.

3. Use the API endpoints to manage tasks and users.

## API Documentation

The API documentation is available through Swagger UI. 
You can access it by running the application and visiting [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).

## Testing

Unit tests and integration tests are provided for the application. 
You can run them using the following command:

mvn test

## Deployment

To deploy the application, you can package it into a JAR file and then run it on a server or cloud platform. 
You can use the following command to package the application:

mvn package

## Built With

- Spring Boot
- H2 Database
- PostgreSQL
- Maven

## Authors

- [urmatai.toktosunova@alatoo.edu.kg](https://github.com/urmataj)
