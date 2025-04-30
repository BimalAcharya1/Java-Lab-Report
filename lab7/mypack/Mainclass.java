package mypack;
    import mypack.Employee;
    public class Mainclass{
    public static void main(String[]args){
        Employee e=new Employee(13,"Bimal","Balkot",400000);
        System.out.println("Employee Details:");
        e.display();
        
    }
}