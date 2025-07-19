/* 1.Write a java program to demonstrate ArithmeticException ArraylndexOutBoundsException and NumberFormatExecptior class. */

package Lab8;

import java.util.Scanner;
public class ExceptionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            //arithmetic Exception
            System.out.println("Enter two integers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Division: "+c);
        }catch(ArithmeticException ex){
            System.out.println("Exception: "+ex.getMessage());
        }
        try{
            //array out of bound exception
            int [] arr = new int [5];
            arr[7] = 100;
            System.out.println("Array element: "+arr[7]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception: "+ex.getMessage());
        }
        
        try{
            // Number format exception
            String s = "hi";
            int n = Integer.parseInt(s);
            System.out.println("String: "+s);
        }catch(NumberFormatException ex){
            System.out.println("Exception: "+ex.getMessage());
        }
        sc.close();
    }
}
