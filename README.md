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
