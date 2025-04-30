import java.util.Scanner;
public class question4
{
 public static void main(String[] args)
 {
  Scanner num = new Scanner(System.in);
  System.out.println("Enter a number: "); 
   int n = num.nextInt();
  int sum = 0, i;
  for(i=1; i<n; i++)
  {
   if(n%i == 0)
   {
    sum = sum+i;
   }
  }
  if(sum == n)
  {
   System.out.println(n+ " is a perfect number");
  }
  else {
   System.out.println(n+ " is not a perfect number");
  }
 }
}