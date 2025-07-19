/* 7.Wap in java to implement Static field and static method. */


public class Q7 {

    static int count = 0;

    static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {

        System.out.println("Initial count: " + count);
        incrementCount();

      
        System.out.println("Updated count: " + count);
        incrementCount();

        System.out.println("Updated count after second increment: " + count);
    }
}
