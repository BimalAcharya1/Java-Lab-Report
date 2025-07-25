// 5. Wap in java to input two number and arithmetic operetor from user and perform all arithmetic operation(+,-,*,/,%) using switch case statement

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Enter an arithmetic operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter one of +, -, *, /, %.");
        }
        
        sc.close();
    }
}
