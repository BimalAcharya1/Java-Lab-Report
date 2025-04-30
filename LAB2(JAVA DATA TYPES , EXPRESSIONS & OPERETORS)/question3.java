import java.util.Scanner;
public class question3{
public static void main(String[]args){
 Scanner sc=new Scanner(System.in);

 System.out.print("Enter num1:");
 int a=sc.nextInt();
 
System.out.print("Enter num2:");
 int b=sc.nextInt();

System.out.print("Enter num3:");
 int c=sc.nextInt();

  int largest=a>b && a>c?a:b>a&&b>c?b:c;
  int smallest=a<b&&a<c?a:b<a&&b<c?b:c;
System.out.println("Largest="+largest);
System.out.println("Smallest="+smallest);
sc.close();
}
}
