import java.util.Scanner;
public class question1{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter the size of array: ");
int n=Sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the elements of array: ");
for(int i=0; i<n ; i++){
arr[i] = Sc.nextInt();
}
int sum=0;
for(int i=0; i<n; i++){
sum=sum+arr[i];
}
System.out.println("Sum=" + sum);
}
}