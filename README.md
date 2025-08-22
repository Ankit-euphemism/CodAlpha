# CodeAlpha

A collection of Java projects developed for CodeAlpha internship tasks.

## Projects Overview

This repository contains three main Java applications:

### 1. Grade Calculator (Task_1.java)
A simple console-based application for calculating student grades.

**Features:**
- Input grades for multiple subjects (Maths, Science, English)
- Calculate average grade
- Find minimum and maximum grades
- Interactive console interface

**Usage:**
```bash
javac Task_1.java
java Task_1
```

### 2. Simple Banking System (Bank.java)
A basic console-based banking application with deposit and withdrawal functionality.

**Features:**
- Deposit money to account
- Withdraw money from account
- Balance inquiry
- Transaction validation
- Menu-driven interface

**Usage:**
```bash
javac Bank.java
java Bank
```

### 3. Hotel Reservation System (src/hotel reservation system/)
A comprehensive GUI-based hotel management system built with Java Swing and MySQL database.

**Features:**
- **User Authentication**: Secure login system
- **Customer Management**: Add new customers with document verification
- **Room Management**: Add, search, and update room availability and status
- **Employee Management**: Add and manage hotel staff information
- **Reception Services**: Centralized dashboard for hotel operations
- **Check-in/Check-out**: Complete booking lifecycle management
- **Driver Services**: Pickup service coordination
- **Department Management**: Organize staff by departments with budget tracking

**System Architecture:**
- **Frontend**: Java Swing GUI with custom icons and styling
- **Backend**: MySQL database for data persistence
- **Database Tables**:
  - `lig`: User authentication credentials
  - `emp`: Employee information
  - `Room`: Room details and availability
  - `driver`: Driver service information
  - `ct`: Customer transaction records
  - `Department`: Department budget management

**Key Components:**
- `HotelReservationSystem.java`: Main entry point with animated splash screen
- `Login.java`: Authentication interface
- `Dashboard.java`: Main navigation hub
- `Reception.java`: Reception desk operations
- `NewCustomer.java`: Customer registration
- `AddRoom.java`: Room management
- `AddEmployee.java`: Staff management
- `SearchRoom.java`: Room search and filtering
- `Checkout.java`: Customer checkout process
- `conn.java`: Database connection handler

## Prerequisites

### For Grade Calculator and Banking System:
- Java Development Kit (JDK) 8 or higher
- Command line interface

### For Hotel Reservation System:
- Java Development Kit (JDK) 8 or higher
- MySQL Server
- MySQL Connector/J driver
- rs2xml.jar library (included in project)

## Database Setup (Hotel Reservation System)

1. Install MySQL Server
2. Create a database named `HotelReservationSystem`
3. Run the SQL script `HotelReservationSystem.sql` to create tables and insert initial data
4. Update database credentials in `conn.java`:
   ```java
   Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelReservationSystem","your_username","your_password");
   ```

## Installation and Setup

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd CodAlpha
   ```

2. For simple Java programs:
   ```bash
   javac Task_1.java
   java Task_1
   ```

3. For Hotel Reservation System:
   ```bash
   cd "src(hotel reservation system)"
   javac -cp "rs2xml.jar;mysql-connector-java.jar;." *.java
   java -cp "rs2xml.jar;mysql-connector-java.jar;." HotelReservationSystem
   ```

## Default Login Credentials

For the Hotel Reservation System:
- **Username**: tajhotel
- **Password**: 34092

## Project Structure

```
CodAlpha/
├── Task_1.java                     # Grade calculator
├── Bank.java                       # Banking system
├── README.md                       # Project documentation
└── src(hotel reservation system)/  # Hotel management system
    ├── *.java                      # Java source files
    ├── HotelReservationSystem.sql  # Database schema
    ├── rs2xml.jar                  # Required library
    └── icons/                      # GUI images and icons
```

## Technologies Used

- **Java**: Core programming language
- **Java Swing**: GUI framework for hotel system
- **MySQL**: Database management
- **JDBC**: Database connectivity
- **rs2xml**: ResultSet to JTable conversion library

## Contributing

This repository contains internship projects. Feel free to fork and modify for learning purposes.

## License

This project is created for educational purposes as part of CodeAlpha internship tasks.

---

*Developed as part of CodeAlpha Java Programming Internship*
