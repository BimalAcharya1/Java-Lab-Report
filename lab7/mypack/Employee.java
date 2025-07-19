/* 7.Write a java program to create user defined package and containing Employee */


package mypack;

public class Employee{
    int id;
    String name,address;
    double salary;
    public Employee(){}
    public Employee(int i,String n,String a,double s){
        id=i;
        name=n;
        address=a;
        salary=s;
    }
    public void display(){
        System.out.println("ID:"+id+"\tNAME:"+name+"\tAddress:"+address+"\tSalary:"+salary);
    }
}

    
