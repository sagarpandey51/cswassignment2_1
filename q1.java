package assignment2;


    class Student {
        private String name;
        private String rollNumber;
        private int age;


        public Student(String name, String rollNumber, int age) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.age = age;
        }


        public String getDetails() {
            return "Name: " + name + ", Roll Number: " + rollNumber + ", Age: " + age;
        }


        public boolean isAdult() {
            return age >= 18;
        }
    }

public class q1 {
        public static void main(String[] args) {

            Student student1 = new Student("Alice", "101", 20);
            Student student2 = new Student("Bob", "B202", 17);
            Student student3 = new Student("Charlie", "C303", 19);


            System.out.println(student1.getDetails());
            System.out.println(student2.getDetails());
            System.out.println(student3.getDetails());


            System.out.println(student1.getDetails() + " is an adult: " + student1.isAdult());
            System.out.println(student2.getDetails() + " is an adult: " + student2.isAdult());
            System.out.println(student3.getDetails() + " is an adult: " + student3.isAdult());
        }
    }

