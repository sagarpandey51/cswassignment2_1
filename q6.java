package assignment2;


import java.util.Objects;

class Animal {
    private String name;
    private String color;
    private String type; // "Pet" or "Wild"

    // Constructor
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    // Override hashCode() method to generate a unique hash for each object
    @Override
    public int hashCode() {
        return Objects.hash(name, color, type);
    }

    // Override toString() method for easy display
    @Override
    public String toString() {
        return "Animal{Name='" + name + "', Color='" + color + "', Type='" + type + "'}";
    }
}

public class q6{
    public static void main(String[] args) {
        // Create multiple Animal objects
        Animal animal1 = new Animal("Tiger", "Orange", "Wild");
        Animal animal2 = new Animal("Dog", "Brown", "Pet");
        Animal animal3 = new Animal("Parrot", "Green", "Pet");
        Animal animal4 = new Animal("Elephant", "Grey", "Wild");
        Animal animal5 = new Animal("Dog", "Brown", "Pet"); // Same attributes as animal2

        // Print hash codes of the Animal objects
        System.out.println(animal1 + " -> HashCode: " + animal1.hashCode());
        System.out.println(animal2 + " -> HashCode: " + animal2.hashCode());
        System.out.println(animal3 + " -> HashCode: " + animal3.hashCode());
        System.out.println(animal4 + " -> HashCode: " + animal4.hashCode());
        System.out.println(animal5 + " -> HashCode: " + animal5.hashCode()); // Should match animal2's hashCode

        // Check if animal2 and animal5 have the same hashCode
        System.out.println("\nDoes animal2 have the same hashCode as animal5? " + (animal2.hashCode() == animal5.hashCode()));
    }
}
