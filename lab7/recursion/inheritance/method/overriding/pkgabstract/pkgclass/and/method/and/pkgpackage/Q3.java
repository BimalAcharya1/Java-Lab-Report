/* 3. Create a base class Fruit which has name, taste and size as its attributes. A  methods called eat() is created which describes the name of the fruit 
and its taste Inhenit the same in 2 other class Apple and Orange and override the eat() method to represent each fruit taste. */

// Base class Fruit
class Fruit {
    String name;
    String taste;
    String size;

    // Constructor to initialize attributes
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to describe the fruit's name and taste
    public void eat() {
        System.out.println("The " + name + " tastes " + taste + " and it is " + size + ".");
    }
}

// Apple class inheriting from Fruit
class Apple extends Fruit {

    // Constructor to initialize Apple-specific attributes
    public Apple(String size) {
        super("Apple", "sweet", size);  // Calling the base class constructor
    }

    // Overriding the eat() method for Apple
    @Override
    public void eat() {
        System.out.println("The Apple is " + taste + " and it is " + size + ".");
    }
}

// Orange class inheriting from Fruit
class Orange extends Fruit {

    // Constructor to initialize Orange-specific attributes
    public Orange(String size) {
        super("Orange", "sour", size);  // Calling the base class constructor
    }

    // Overriding the eat() method for Orange
    @Override
    public void eat() {
        System.out.println("The Orange is " + taste + " and it is " + size + ".");
    }
}

public class Q3 {
    public static void main(String[] args) {
        // Creating objects of Apple and Orange
        Apple apple = new Apple("medium");
        Orange orange = new Orange("large");

        // Calling the eat() method for both objects
        apple.eat();    // This will call the overridden eat() method in Apple class
        orange.eat();   // This will call the overridden eat() method in Orange class
    }
}
