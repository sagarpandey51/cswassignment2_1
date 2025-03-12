package assignment2;



import java.util.Arrays;
import java.util.Scanner;

class People {
    private String name;
    private int rollNo;
    private int age;

    // Constructor
    public People(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    // Override toString() method for easy display
    @Override
    public String toString() {
        return "People{Name='" + name + "', RollNo=" + rollNo + ", Age=" + age + "}";
    }
}

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of people
        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        People[] people = new People[n];

        // Input details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            int rollNo = scanner.nextInt();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            people[i] = new People(name, rollNo, age);
        }

        // Sorting by Roll Number using Lambda Expression
        Arrays.sort(people, (p1, p2) -> Integer.compare(p1.getRollNo(), p2.getRollNo()));
        System.out.println("\nPeople sorted by Roll Number:");
        printPeople(people);

        // Sorting by Age using Lambda Expression
        Arrays.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("\nPeople sorted by Age:");
        printPeople(people);

        scanner.close();
    }

    // Helper method to print people array
    private static void printPeople(People[] people) {
        for (People p : people) {
            System.out.println(p);
        }
    }
}
