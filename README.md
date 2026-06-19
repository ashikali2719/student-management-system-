<<<<<<< HEAD
# Business Decision System

A Java-based competitive pricing tool that helps a seller decide how to price a product by comparing it against live competitor pricing and key business signals.

## Overview

The system takes in product details — stock quantity, sales count, market demand, and your current price — then fetches the competitor's price for the same product and runs it through a decision engine. The engine returns a confidence score and a recommended decision level (e.g. how strongly to trust/act on the suggested price), along with a plain-language summary.

If the competitor price can't be fetched automatically, the program falls back to manual entry so the workflow never breaks.

## Features

- Console-based input for product stock, sales, demand, and price
- Automated competitor price lookup via web scraping (Selenium/ChromeDriver)
- Manual fallback entry when scraping fails
- Confidence scoring and decision-level recommendation based on combined business signals
- Servlet-based component for web-driven access to the decision engine

## Tech Stack

- **Language:** Java
- **Automation:** Selenium WebDriver (ChromeDriver) for competitor price scraping
- **Web Layer:** Java Servlets
- **Design:** Modular structure — `Product` (data model), `MarketDataScraper` (data collection), `DecisionEngine` (business logic), `Main`/`DecisionServlet` (entry points)

## How to Run (Console Version)

1. Clone or download this repository.
2. Compile the source files:
   ```bash
   javac Main.java Product.java MarketDataScraper.java DecisionEngine.java
   ```
3. Run the application:
   ```bash
   java Main
   ```
4. Enter the requested product details when prompted. The system will attempt to fetch the competitor's price automatically; if unavailable, you'll be asked to enter it manually.

> Note: Competitor price scraping requires ChromeDriver to match your installed Chrome version.

## Sample Interaction

```
=== Business Decision System ===
Enter Product Name: Wireless Mouse
Enter Stock Quantity: 50
Enter Sales Count: 120
Enter Market Demand (1-100): 80
Enter Your Product Price: 499

Fetched Competitor Price: 459.0

=== Result ===
Product Name     : Wireless Mouse
Competitor Price  : 459.0
Confidence        : 78%
Decision Level     : Moderate
```

## What I Learned

Building this project involved combining real-time data scraping with rule-based decision logic, and structuring the codebase so the core business logic (`DecisionEngine`) stays independent of how the data is gathered (console input vs. scraped data vs. servlet request).

## Author

**Ashik Ali S**
[LinkedIn](https://www.linkedin.com/in/ashik-alis/) · [GitHub](https://github.com/ashikali2719)
=======
# 🎓 Student Management System

A simple Java console application for managing student records using object-oriented programming.

This project demonstrates how to add and view student details using a clean menu-driven interface, validate user input, and work with collections in Java.

## Features

- Add student records with ID, name, age
- View all saved student records
- Duplicate ID check
- Includes a gender field for each student
- Input validation for numbers and required fields

## Tech Stack

- Java
- Object-Oriented Programming (OOP)
- `ArrayList`
- `Scanner`

## How to Run

1. Open a terminal in the project folder.
2. Compile the Java file:

```bash
javac StudentManagementSystem.java
```

3. Run the application:

```bash
java StudentManagementSystem
```

## Sample Input

```
1
101
Alice Johnson
20

2

3
```

## Sample Output

```
Welcome to Student Management System
-------------------------------------
Menu:
1. Add Student
2. View All Students
3. Exit
Enter your option: 1

Add New Student
-----------------
Enter student id: 101
Enter student name: Alice Johnson
Enter student age: 20
Student added successfully.

Menu:
1. Add Student
2. View All Students
3. Exit
Enter your option: 2

All Students
------------
ID    Name                 Age 
--------------------------------
101   Alice Johnson        20

Menu:
1. Add Student
2. View All Students
3. Exit
Enter your option: 3
Exiting program. Goodbye!
```

## Author

Ashik Ali
>>>>>>> 69961873bbba4eb4bed6ec9c6ca68ae1d69a004e
