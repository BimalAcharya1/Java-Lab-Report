// Single-level Inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {  // Dog class inherits from Animal
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multi-level Inheritance
class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {  // Car inherits from Vehicle
    void drive() {
        System.out.println("Car drives");
    }
}

class ElectricCar extends Car {  // ElectricCar inherits from Car, which inherits from Vehicle
    void charge() {
        System.out.println("Electric car is charging");
    }
}

// Hierarchical Inheritance
class Device {
    void powerOn() {
        System.out.println("Device is powered on");
    }
}

class Mobile extends Device {  // Mobile inherits from Device
    void call() {
        System.out.println("Mobile is making a call");
    }
}

class Laptop extends Device {  // Laptop inherits from Device
    void code() {
        System.out.println("Laptop is coding");
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Single-level Inheritance example
        System.out.println("Single-level Inheritance:");
        Dog dog = new Dog();
        dog.sound();  // Inherited from Animal class
        dog.bark();   // Specific to Dog class
        System.out.println();

        // Multi-level Inheritance example
        System.out.println("Multi-level Inheritance:");
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();   // Inherited from Vehicle class
        electricCar.drive();  // Inherited from Car class
        electricCar.charge(); // Specific to ElectricCar class
        System.out.println();

        // Hierarchical Inheritance example
        System.out.println("Hierarchical Inheritance:");
        Mobile mobile = new Mobile();
        mobile.powerOn();  // Inherited from Device class
        mobile.call();     // Specific to Mobile class
        
        Laptop laptop = new Laptop();
        laptop.powerOn();  // Inherited from Device class
        laptop.code();     // Specific to Laptop class
    }
}