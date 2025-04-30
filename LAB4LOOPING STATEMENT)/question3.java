import java.util.Scanner;
public class question3
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number: ");
   int num = sc.nextInt();

  int n = num, digit, temp;
  int sum=0, d=0;
  
  for(temp=num; temp>0; temp = temp/10)
  {
   d++;
  }
 
  for(temp=num; temp>0; temp=temp/10)
  {
   digit = temp%10;
   int p = 1, i;

   for(i=0; i<d; i++)
   {
    p = p*digit;
   }

   sum = sum+p;
  
  }
  if(sum == n)
  {
   System.out.println(n+ " is an armstrong number");
  }
  else {
   System.out.println(n+ " is not an armstrong number");
  }
 }
}