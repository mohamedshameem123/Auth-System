# Auth-System (Spring Boot + JWT + MySQL)

This project is a simple authentication system built using Spring Boot, Spring Security, JWT (JSON Web Token), and MySQL. It includes user registration, login, and token-based authentication. The purpose of this project is to understand how secure authentication works in backend applications.

## Features
- User registration with name, email, password, and role
- Login with email and password
- Generation of JWT token after successful login
- Password encryption using BCrypt
- Secured endpoints that require a valid token
- MySQL database integration using Spring Data JPA

## Technologies Used
- Java 17  
- Spring Boot 3  
- Spring Security  
- JWT (jjwt)  
- MySQL  
- Hibernate / JPA  

## Project Structure
```
src/main/java/com/example/jwtauthdemo
  ├── Controller  -> Contains API endpoints
  ├── Dao         -> Repository layer
  ├── Model       -> User entity
  ├── Security    -> JWT classes and security configuration
src/main/resources
  ├── static/index.html -> Frontend page
  └── application.properties
```

## Setup Instructions

### 1. Clone the repository
```
git clone https://github.com/mohamedshameem123/Auth-System.git
cd Auth-System
```

### 2. Create a MySQL database
```
CREATE DATABASE authsystem;
```

### 3. Configure the database in application.properties
```
spring.datasource.url=jdbc:mysql://localhost:3306/authsystem
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Run the application
```
mvn spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

## API Endpoints

### Register a new user
POST `/api/auth/register`
```
{
  "name": "Shameem",
  "email": "abushameem2002@gmail.com",
  "password": "1234",
  "role": "USER"
}
```

### Login
POST `/api/auth/login`
```
{
  "email": "abushameem2002@gmail.com",
  "password": "1234"
}
```

Response:
```
{
  "token": "your-jwt-token"
}
```

### Access protected user info
GET `/api/user/info`

Header:
```
Authorization: Bearer <token>
```

## Live Preview (Frontend)
GitHub Pages:
https://mohamedshameem123.github.io/Auth-System/

## Purpose of This Project
This project was created to practice:
- Implementing JWT authentication
- Securing REST APIs
- Working with Spring Security
- Connecting Spring Boot with MySQL
- Testing APIs using Postman

## Author
Mohamed Shameem  
GitHub: https://github.com/mohamedshameem123
