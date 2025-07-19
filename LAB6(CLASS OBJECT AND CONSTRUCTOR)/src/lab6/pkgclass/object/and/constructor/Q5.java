/* 5.Create a java class time with three artribute hours, minutes, and seconds. 
Use appropriate constructors to initalize instance variable. Use methods to 
display time HH:MM:SS format add and subtract two time object. 
Implement the class to add, subtract aad display time object  */

class Time {
    int hour;
    int min;
	int sec;

    public Time(int h, int m, int s) {
        hour = h;
        min = m;
	sec = s;
    }
    Time add(Time t) {
        return new Time( hour + t.hour , min + t.min , sec + t.sec);
    }
	
	Time sub(Time t) {
        return new Time( hour - t.hour , min - t.min , sec - t.sec);
    }

     void display() {
        System.out.println( hour + "HH:"  + min + "MM:"  + sec +  "SS" );
    }
}
public class Q5 {
    public static void main(String[] args) {

        Time t1 = new Time(4,20,55);
        Time t2 = new Time(1,40,35);

	System.out.println("Time of first: ");
	t1.display();
	System.out.println("Time of second: ");
	t2.display();
	
	System.out.println("Adding two time : ");
     	Time sum = t1.add(t2);
	sum.display();

	System.out.println("Subract two time : ");
     	Time subt = t1.sub(t2);
	subt.display();

 	
    }
}
