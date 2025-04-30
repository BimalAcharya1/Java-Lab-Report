import java.util.Scanner;
public class question4{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
int[][] first = new int[3][3];
int[][] second = new int[3][3];
int[][] result = new int[3][3];
System.out.println("Enter elements for first Matrix: ");
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
first[i][j] = Sc.nextInt();
}
}
System.out.println("Enter elements for Second Matrix: ");
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
second[i][j] = Sc.nextInt();
}
}
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
result[i][j] = 0;
for (int k = 0; k < 3; k++) {
result[i][j] =result[i][j] + first[i][k] * second[k][j];
}
}
}
System.out.println("The result of the multiplication is: ");
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(result[i][j] + " ");
}
System.out.println();
}
}
}
