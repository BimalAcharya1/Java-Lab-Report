// Interface for Addition
interface Addition {
    double add(double a, double b);
}

// Interface for Subtraction
interface Subtraction {
    double subtract(double a, double b);
}

// Interface for Multiplication
interface Multiplication {
    double multiply(double a, double b);
}

// Interface for Division
interface Division {
    double divide(double a, double b);
}

// Calculator class implementing all the operations
class Calculator implements Addition, Subtraction, Multiplication, Division {

    // Implementing the add method
    public double add(double a, double b) {
        return a + b;
    }

    // Implementing the subtract method
    public double subtract(double a, double b) {
        return a - b;
    }

    // Implementing the multiply method
    public double multiply(double a, double b) {
        return a * b;
    }

    // Implementing the divide method
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Return NaN if division by zero
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        // Creating an object of the Calculator class
        Calculator calc = new Calculator();

        // Performing operations using the Calculator object
        double num1 = 10;
        double num2 = 5;

        // Addition
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + calc.add(num1, num2));

        // Subtraction
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + calc.subtract(num1, num2));

        // Multiplication
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + calc.multiply(num1, num2));

        // Division
        System.out.println("Division: " + num1 + " / " + num2 + " = " + calc.divide(num1, num2));

        // Attempting division by zero
        double num3 = 0;
        System.out.println("Division by zero: " + num1 + " / " + num3 + " = " + calc.divide(num1, num3));
    }
}