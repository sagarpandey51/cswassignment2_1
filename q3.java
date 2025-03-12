package assignment2;

class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed; // Speed in km/h

    // Constructor
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Car Model: " + model + ", Color: " + color + ", Speed: " + speed + " km/h";
    }

    // Implement compareTo method to compare cars based on speed
    @Override
    public int compareTo(Car second) {
        return Integer.compare(this.speed, second.speed);
    }
}

public class q3 {
    public static void main(String[] args) {
        // Instantiate two Car objects
        Car car1 = new Car("Toyota Camry", "Red", 180);
        Car car2 = new Car("Honda Accord", "Blue", 200);

        // Compare the cars based on their speed
        if (car1.compareTo(car2) > 0) {
            System.out.println("The car with greater speed is: " + car1);
        } else if (car1.compareTo(car2) < 0) {
            System.out.println("The car with greater speed is: " + car2);
        } else {
            System.out.println("Both cars have the same speed.");
        }
    }
}