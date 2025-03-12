package assignment2;

import java.util.Scanner;

class Children implements Comparable<Children> {
    private String name;
    private String rollNumber;
    private int totalMark;

    // Constructor
    public Children(String name, String rollNumber, int totalMark) {
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

    // Implement compareTo method to compare students based on total marks
    @Override
    public int compareTo(Children other) {
        return Integer.compare(this.totalMark, other.totalMark);
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of Children objects
        System.out.print("Enter the number of children: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Children[] childrenArray = new Children[n];

        // Input children details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of child " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number of child " + (i + 1) + ": ");
            String rollNumber = scanner.nextLine();
            System.out.print("Enter total marks of child " + (i + 1) + ": ");
            int totalMark = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            childrenArray[i] = new Children(name, rollNumber, totalMark);
        }

        // Search for a specific child by roll number
        System.out.print("Enter roll number to search for: ");
        String searchRollNumber = scanner.nextLine();

        Children foundChild = linearSearch(childrenArray, searchRollNumber);

        if (foundChild != null) {
            System.out.println("Child found: " + foundChild);
        } else {
            System.out.println("Child with roll number " + searchRollNumber + " not found.");
        }

        scanner.close();
    }

    // Linear search method
    public static Children linearSearch(Children[] childrenArray, String rollNumber) {
        for (Children child : childrenArray) {
            if (child.getRollNumber().equals(rollNumber)) {
                return child; // Return the found child
            }
        }
        return null; // Return null if not found
    }
}
