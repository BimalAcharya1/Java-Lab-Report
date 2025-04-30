class Student {
    String name;
    String address;
    int roll;

    public Student() {
        this.name = "Empty";
        this.address = "Empty";
        this.roll = 0;
    }

    public Student(String name, String address, int roll) {
        this.name = name;
        this.address = address;
        this.roll = roll;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: " + address);
        System.out.println("Student Roll Number: " + roll);
    }
}
public class Q2{

    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println("Using Default Constructor:");
        student1.display();
        System.out.println();

        Student student2 = new Student("Albin Chow","China-7" , 36);
        System.out.println("Using define value:");
        student2.display();
    }
}