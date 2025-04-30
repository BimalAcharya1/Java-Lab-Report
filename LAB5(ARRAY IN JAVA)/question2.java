import java.util.Scanner;
public class question2{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter the size of array: ");
int n=Sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the elements of array: ");
for(int i=0; i<n ; i++){
arr[i] = Sc.nextInt();
}
int min, max;
min=max=arr[0]; 
for(int i=1; i<n; i++){
if(min>arr[i])
min=arr[i];
if(max<arr[i])
max=arr[i];
}
System.out.println("Minimum=" + min);
System.out.println("Maximum=" + max);
}
}
