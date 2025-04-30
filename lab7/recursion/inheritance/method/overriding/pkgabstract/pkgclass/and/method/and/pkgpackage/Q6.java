//Abstract class Animal

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();
    
    // Concrete method (has a body)
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Concrete class Dog that extends Animal
class Dog extends Animal {
    // Implementing the abstract method sound() in Dog class
    @Override
    public void sound() {
        System.out.println("The Dog barks.");
    }
}

// Concrete class Cat that extends Animal
class Cat extends Animal {
    // Implementing the abstract method sound() in Cat class
    @Override
    public void sound() {
        System.out.println("The Cat meows.");
    }
}

public class Q6 {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling methods on Dog and Cat objects
        myDog.sound();   // Calls Dog's implementation of sound
        myDog.sleep();   // Calls Animal's concrete method sleep

        myCat.sound();   // Calls Cat's implementation of sound
        myCat.sleep();   // Calls Animal's concrete method sleep
    }
}