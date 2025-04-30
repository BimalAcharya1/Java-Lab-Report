public class Q6 {

    public static void callByValue(int a) {
        System.out.println("Value before modification: " + a);
        a = 10;
        System.out.println("Value after modification : " + a);
    }

    public static void callByReference(int[] arr) {
        System.out.println("Value before modification: " + arr[0]);
        arr[0] = 100;
        System.out.println("Value after modification: " + arr[0]);
    }

    public static void main(String[] args) {

        int x = 5;
	System.out.println("call By Value");
        System.out.println("Original value of x: " + x);
        callByValue(x);
        System.out.println("Value of x after callByValue: " + x);

        int[] array = { 27 };
	System.out.println(" ");
	System.out.println("call By Reference");
        System.out.println("Original value of array: " + array[0]);
        callByReference(array);
        System.out.println("Value of array after callByReference: " + array[0]); 
    }
}