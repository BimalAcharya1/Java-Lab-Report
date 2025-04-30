public class question1{
public static void main(String[]args){
int a=9;
int b=13;
int c=3;
double x=a-b/3.0+c*2-1;
double y=a-(float)b/(3+c)*(2-1);
double z=a-((float)b/(3+c)*2)-1;
System.out.printf("x=%.2f%n",x);
System.out.printf("y=%.2f%n",y);
System.out.printf("z=%.2f%n",z);
}
}