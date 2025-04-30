import java.util.Scanner;
public class Question2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Number: ");
int num=sc.nextInt();

if(num>0){
	System.out.println(num + "is Positive Number");
}else if(num<0){
	System.out.println(num + "is Negitive Number");
}else{
	System.out.println(num +" number is zero");
}
sc.close();
}
}