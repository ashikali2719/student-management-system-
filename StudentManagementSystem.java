import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagementSystem {

    static class Student {
        private int id;
        private String name;
        private int age;
        private String gender;

        public Student(int id, String name, int age, String gender) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return String.format("%-5d %-20s %-4d %-10s", id, name, age, gender);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean keepRunning = true;

        System.out.println("Welcome to Student Management System");
        System.out.println("-------------------------------------");

        while (keepRunning) {
            showMenu();
            int choice = readInteger(scanner, "Enter your option: ");

            switch (choice) {
                case 1:
                    addStudent(scanner, students);
                    break;
                case 2:
                    viewAllStudents(students);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Exit");
    }

    private static int readInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    private static void addStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.println("\nAdd New Student");
        System.out.println("-----------------");

        int id = readInteger(scanner, "Enter student id: ");
        scanner.nextLine();

        // Duplicate ID check
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student with this ID already exists.");
                return;
            }
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty()) {
            System.out.print("Name cannot be empty. Enter student name: ");
            name = scanner.nextLine().trim();
        }

        int age = readInteger(scanner, "Enter student age: ");
        scanner.nextLine();

        // Gender input validation
        String gender;
        while (true) {
            System.out.print("Enter gender (Male/Female/Other): ");
            gender = scanner.nextLine().trim();
            if (gender.equalsIgnoreCase("Male") ||
                gender.equalsIgnoreCase("Female") ||
                gender.equalsIgnoreCase("Other")) {
                break;
            } else {
                System.out.println("Invalid gender. Please enter Male, Female, or Other.");
            }
        }

        Student student = new Student(id, name, age, gender);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    private static void viewAllStudents(ArrayList<Student> students) {
        System.out.println("\nAll Students");
        System.out.println("------------");

        if (students.isEmpty()) {
            System.out.println("No students available. Add a student first.");
            return;
        }

        System.out.printf("%-5s %-20s %-4s %-10s%n", "ID", "Name", "Age", "Gender");
        System.out.println("--------------------------------------------------");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}