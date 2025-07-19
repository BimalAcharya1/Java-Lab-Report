

class Distance {
    private int feet;
    private int inches;

    public Distance(int f, int i) {
        feet = f;
        inches = i;
    }
    Distance add(Distance d) {
        return new Distance(feet + d.feet, inches + d.inches);
    }

     void display() {
        System.out.println(feet + " ft and " + inches + " inch" );
    }
}
public class Mydistance {
    public static void main(String[] args) {

        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(7,3);
	System.out.println("Distance of first: ");
	d1.display();
	System.out.println("Distance of second: ");
	d2.display();
	
	System.out.println("Total Distance: ");
     	Distance sum = d1.add(d2);
	sum.display();

 	
    }
}
