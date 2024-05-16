// Base class
class Animal {
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display animal details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to make sound (generic for all animals)
    void makeSound() {
        System.out.println(name + " is making a sound");
    }
}

// Derived class
class Dog extends Animal {
    String breed;

    // Constructor
    Dog(String name, int age, String breed) {
        super(name, age); // Calling the constructor of the base class
        this.breed = breed;
    }

    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }

    // Overriding the displayDetails method to include breed information
    @Override
    void displayDetails() {
        super.displayDetails(); // Calling the displayDetails method of the base class
        System.out.println("Breed: " + breed);
    }
}

// Another derived class
class Cat extends Animal {
    String breed;

    // Constructor
    Cat(String name, int age, String breed) {
        super(name, age); // Calling the constructor of the base class
        this.breed = breed;
    }

    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow");
    }

    // Overriding the displayDetails method to include breed information
    @Override
    void displayDetails() {
        super.displayDetails(); // Calling the displayDetails method of the base class
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Siamese");

        // Displaying details and sounds of Dog
        dog.displayDetails();
        dog.makeSound();

        System.out.println();

        // Displaying details and sounds of Cat
        cat.displayDetails();
        cat.makeSound();
    }
}
