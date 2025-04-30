import java.util.Scanner;

public class Q1 {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for factorial
        System.out.print("Enter a number to find the factorial: ");
        int numFactorial = scanner.nextInt();
        System.out.println("Factorial of " + numFactorial + " is: " + factorial(numFactorial));

        // Input for Fibonacci
        System.out.print("Enter a number to find the nth Fibonacci term: ");
        int numFibonacci = scanner.nextInt();
        System.out.println("The " + numFibonacci + "th Fibonacci term is: " + fibonacci(numFibonacci));
        
        scanner.close();
    }
}