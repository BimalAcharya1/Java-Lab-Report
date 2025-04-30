import java.util.Scanner;
public class question5{
public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter num1:");
 int a=sc.nextInt();
 
System.out.print("Enter num2:");
 int b=sc.nextInt();
  int and=a&b;
  int or=a|b;
  int xor=a^b;
    
System.out.println("Bitwise And="+and);
System.out.println("Bitwise OR="+or);
System.out.println("Bitwise XOR="+xor);

sc.close();
}
}
