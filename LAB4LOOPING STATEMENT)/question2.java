import java.util.Scanner;
public class question2
{
 public static void main(String[] args)
 {
  Scanner num = new Scanner(System.in);
  System.out.println("Enter a number: ");
  int n = num.nextInt();
  int i, c = 0;
  for(i=1; i<=n; i++)
  {
   if(n%i == 0)
   {
    c++;
   }
  }
  if(c == 2)
  {
   System.out.println(n+ " is a prime number");
  }
  else {
   System.out.println(n+ " is not a prime number");
  }
 }
}