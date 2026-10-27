# Employee Management System

## About the Project
The Employee Management System is a desktop application developed using Java Swing and MySQL. It helps manage employee information through a graphical user interface.

The project connects a Java application to a MySQL database using JDBC.

## Technologies Used
- **Java** – Application logic
- **Java Swing** – Graphical User Interface (GUI)
- **MySQL** – Database management
- **JDBC** – Database connectivity
- **MySQL Connector/J** – JDBC driver
- **JCalendar** – Date selection component

## Features
- User login authentication
- Add new employee details
- View employee information
- Update existing employee records
- Delete employee records
- Store and retrieve employee data using MySQL
- Interactive graphical interface

## Project Structure
```text
employee_management_system/
├── .vscode/
├── lib/
│   ├── mysql-connector-java-8.0.28.jar
│   └── jcalendar-tz-1.3.3-4.jar
├── src/
│   ├── AddEmployee.java
│   ├── Conn.java
│   ├── Login.java
│   ├── Main_class.java
│   ├── Splash.java
│   └── ...
├── bin/
└── README.md
```

## Prerequisites
Before running the application, install:
- JDK (Java Development Kit)
- MySQL Server
- MySQL Workbench
- Visual Studio Code
- Java extensions for VS Code

## Database Setup
1. Start MySQL Server.
2. Open MySQL Workbench and connect to your local server.
3. Create the database used by the application.
4. Create the required tables for login authentication and employee information.
5. Update the database connection details in `Conn.java`.

Example database creation:

```sql
CREATE DATABASE employee_management;
```

Make sure the database and table names match those used in the Java source code.

## Configuration
Update the JDBC connection settings in `Conn.java` with your local MySQL credentials.

Example:

```java
String url = "jdbc:mysql://localhost:3306/employee_management";
String user = "root";
String password = "YOUR_MYSQL_PASSWORD";
```

Replace `YOUR_MYSQL_PASSWORD` with your local MySQL password. Do not commit actual passwords to a public repository.

Ensure that the required JAR files in the `lib` folder are included in the Java classpath.

## How to Run
1. Clone or download this repository.
2. Open the project folder in Visual Studio Code.
3. Verify that the MySQL Connector/J and JCalendar libraries are configured.
4. Start MySQL Server.
5. Create and configure the required database tables.
6. Run `Splash.java` or `Login.java`, depending on your application setup.
7. Log in using a valid account in the login table.

## Learning Outcomes
- Understanding Java Swing GUI development
- Connecting Java applications to MySQL using JDBC
- Performing database operations using SQL
- Implementing basic login authentication
- Organizing a Java desktop application into multiple classes

## Future Improvements
- Password hashing and stronger authentication
- Input validation and error handling
- Employee search and filtering
- Improved user interface
- Employee reports and data export

## Author
Developed as a Java desktop application project.
