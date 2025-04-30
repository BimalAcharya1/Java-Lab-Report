import java.util.Scanner;
public class Question3
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Number: ");
int a=sc.nextInt();

System.out.println("Enter Number: ");
int b=sc.nextInt();

System.out.println("Enter Number: ");
int c=sc.nextInt();

if(a>b && a<c || a>c && a<b){
	System.out.println( a+ " is Second Largest Number");
}else if(b>a && b<c || b>c && b<a){
	System.out.println( b+ " is Second Largest Number");
}else{
	System.out.println( c+ " is Second Largest Number");
}
sc.close();
}
}