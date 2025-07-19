/* 4.Wap in java to perform autoboxing and autounboxing using wrapper class. */

package Lab9;

public class WrapperEx {
    public static void main(String[] args) {
        //Auto Boxing
        int x=36;
        Integer n  = x;
        System.out.println("Primitive type: "+x);
        System.out.println("Wrapper Object: "+n);
        
        //Auto Unboxing
        Integer num = new Integer(832);
        int y = num;
        System.out.println("Wrapper Object: "+num);
        System.out.println("Primitive type: "+y);
    }
}
