public class question2
{
public static void main(String[]args)
{
double num1=Double.parseDouble(args[0]);
double num2=Double.parseDouble(args[1]);
double sum=num1+num2;
double diff=num1-num2;
double mul=num1*num2;
double div=num1/num2;

System.out.println("Sum="+sum);
System.out.println("Difference="+diff);
System.out.println("Multiplecation="+mul);
System.out.println("Division="+div);
}
}