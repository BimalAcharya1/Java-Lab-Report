import java.util.Scanner;
public class question1
{
 public static void main(String[] args)
 {
  Scanner num = new Scanner(System.in);
  System.out.println("Enter the number: ");
   int n = num.nextInt();
  int sum=0;
  while (n > 0) 
  {
   sum = sum + n % 10;  
   n = n / 10;  
  }
  System.out.println("Sum of digits: " +sum);
 }
}