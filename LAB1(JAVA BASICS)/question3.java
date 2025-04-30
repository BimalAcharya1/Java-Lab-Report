public class question3
{
public static void main(String[]args)
{
double L=Double.parseDouble(args[0]);
double B=Double.parseDouble(args[1]);

double A=L*B;
double P=2*(L+B);

System.out.println("Area of Rectangle="+A);
System.out.println("Perimeter of Rectangle="+P);
}
}