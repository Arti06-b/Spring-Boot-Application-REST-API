CRUD REST API with Spring Boot and H2 In-Memory Database
  📖 Project Overview
    This project is a simple CRUD (Create, Read, Update, Delete) REST API built using Spring Boot and an H2 in-memory database. 
    It demonstrates how to structure a Spring Boot application with a clean architecture following best practices.
    The API allows users to perform basic CRUD operations on a User entity. 
    It is designed for beginners to understand the fundamentals of building REST APIs with Spring Boot.
    
🚀 Features
CRUD Operations: Create, Read, Update, and Delete runs.

RESTful Endpoints: Implements REST standards for API design.

H2 In-Memory Database: Temporary database that resets every time the application restarts.

Layered Architecture: Separates Controller, Service, and Repository layers.


🛠️ Technologies Used

Java 17

Spring Boot 3

H2 In-Memory Database

Lombok (optional for reducing boilerplate code)

--Access the APIThe API will be running at:

http://localhost:8080/api/runs

🛠️ H2 Database Console

The H2 database console can be accessed at:

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)

📖 Learnings from the Project

How to set up a Spring Boot project from scratch.

Understanding RESTful API design.

Using H2 as an in-memory database for development and testing.

Implementing a layered architecture with Controller, Service, and Repository layers.
