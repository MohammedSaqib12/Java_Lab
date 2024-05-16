public class Ex7 {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        System.out.println("Dog Information:");
        dog.display();
        dog.makeSound();

        System.out.println("\nCat Information:");
        cat.display();
        cat.makeSound();
    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
    public void display() {
        System.out.println("Name: " + name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Meow!");
    }
}

