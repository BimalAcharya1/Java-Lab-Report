import java.util.Scanner;
public class question2_2{
public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter num1:");
 int a=sc.nextInt();
 
System.out.print("Enter num2:");
 int b=sc.nextInt();
  a=a+b;
  b=a-b;
  a=a-b;

System.out.println("Num1="+a);
System.out.println("Num2="+b);
sc.close();
}
}
