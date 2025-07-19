//5. Write a java program to find sum of odd number from 1 to 50 using continue statement.

public class question5
{
 public static void main(String[] args)
 {
  int sum=0;
  int i;
  for (i=1; i<=50; i++)
  {
   if(i%2 == 0)
    continue;
   sum = sum+i;
  }
  System.out.println("Sum of odd numbers = " +sum);
 }
}
