# Employee Management System

This project is an Employee Management System built using Spring Boot, Spring MVC, Spring Data JPA, Thymeleaf and MySQL. It provides a set of APIs for interacting with the web application and the underlying database with standard CRUD operations: Create, Retrieve, Update and Delete.

![WhatsApp Image 2023-05-22 at 00 11 27](https://github.com/aadityazz/EMS-SpringBoot/assets/67819043/befd0bec-0666-461c-981e-4ecebf35b6c5)

## Working

![WhatsApp Image 2023-05-21 at 20 39 23](https://github.com/aadityazz/EMS-SpringBoot/assets/67819043/aee87d00-454f-479f-9e9f-5eee99d3dfc4)
...

## Features

- CRUD operations for managing employees
- Employee Id generation
- Pagination for complex data

## Technologies Used

- Spring Boot - Framework for building Java applications quickly and easily.
- Spring MVC - Provides a model-view-controller architecture for building web applications.
- Spring Data JPA - Simplifies the implementation of data access layer using Java Persistence API (JPA).
- MySQL - Relational database management system.
- Maven - Dependency management and build tool.
- ThymeLeaf - Simplifies coding the view layer. No more cluttered JSP and JSTL tags.

## Development Under

- Java 17
- Intellij Idea
- MySQL Server
- Maven

## Getting Started

1. Clone the repository:
git clone https://github.com/aadityazz/EMS-Springboot.git

2. Configure the MySQL database:
- Create a new database in MySQL.
- Open `src/main/resources/application.properties` file.
- Modify the following properties according to your MySQL configuration:

  ```
  spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  ```

3. Build the project:
```shell
cd employee-management-system
mvn clean install
```

4. Run the application:
- mvn spring-boot:run

5. The application should now be running at http://localhost:8080.

## Security

This application implements basic authentication and role-based authorization for MySQL. By default, the following credentials are configured:

Username: admin
Password: password
Note: This is a simplified implementation for demonstration purposes only. In a production environment, it is recommended to use a more secure authentication mechanism.

## Contributing

Contributions to this project are welcome! If you find any issues or want to add new features, feel free to submit a pull request.

## Contact

If you have any questions or feedback, please feel free to reach out to the project maintainers.
