package assignment2;

import java.util.Scanner;

class student implements Comparable<student> {
    private String name;
    private String rollNumber;
    private int totalMark;

    // Constructor
    public student(String name, String rollNumber, int totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getTotalMark() {
        return totalMark;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Total Marks: " + totalMark;
    }

    // Implement compareTo method to compare students by roll number
    @Override
    public int compareTo(student other) {
        return this.rollNumber.compareTo(other.rollNumber);
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        student[] students = new student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number of student " + (i + 1) + ": ");
            String rollNumber = scanner.nextLine();
            System.out.print("Enter total marks of student " + (i + 1) + ": ");
            int totalMark = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            students[i] = new student(name, rollNumber, totalMark);
        }

        // Sort students using Bubble Sort (which now uses compareTo method)
        bubbleSort(students);

        // Display sorted students
        System.out.println("\nStudents sorted by roll number:");
        for (student s : students) {
            System.out.println(s);
        }

        scanner.close();
    }

    // Bubble Sort algorithm to sort students by roll number using compareTo
    public static void bubbleSort(student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap students[j] and students[j + 1]
                    student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
