// Base class Shape
class Shape {
    // Method to be overridden in subclasses
    public void area() {
        System.out.println("Area of shape is not defined.");
    }
}

// Subclass Triangle extending Shape
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding the area() method to calculate the area of the triangle
    @Override
    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Subclass Rectangle extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the area() method to calculate the area of the rectangle
    @Override
    public void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Creating objects of Triangle and Rectangle
        Shape shape1 = new Triangle(10, 5);  // Creating Triangle object
        Shape shape2 = new Rectangle(8, 4);  // Creating Rectangle object

        // Calling the overridden area() method
        shape1.area();  // Calls Triangle's area() method
        shape2.area();  // Calls Rectangle's area() method
    }
}