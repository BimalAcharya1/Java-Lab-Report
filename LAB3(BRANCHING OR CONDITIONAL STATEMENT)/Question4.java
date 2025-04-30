import java.util.Scanner;
public class Question4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Number: ");
int num=sc.nextInt();

if(num%2==0){
	if(num%3==0){
		System.out.println( num+ " is Even and Divisible by 3");
		}else{
		System.out.println( num+ " is Even and but not Divisible by 3");
		}
}else{
		if(num%3==0){
		System.out.println( num+ " is Odd and Divisible by 3");
		}else{
		System.out.println( num+ " is Odd and but not Divisible by 3");
		}
		
}
sc.close();
}
}