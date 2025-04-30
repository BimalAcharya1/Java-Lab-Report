import java.util.Scanner;
public class question4{
public static void main(String[]args){
 Scanner sc=new Scanner(System.in);

 System.out.print("Enter mark of computer:");
 double C=sc.nextDouble();
 
System.out.print("Enter mark of math:");
 double M=sc.nextDouble();

System.out.print("Enter mark of English:");
 double E=sc.nextDouble();

System.out.print("Enter mark of Science:");
 double S=sc.nextDouble();

System.out.print("Enter mark of Nepali:");
 double N=sc.nextDouble();

double total=C+M+E+S+N;
double average=total/5;

System.out.printf("Total:%.2f%n",total);
System.out.printf("Average:%.2f%n",average);
sc.close();
}
}
