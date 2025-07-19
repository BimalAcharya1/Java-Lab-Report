/* 5.Wap in java to illustrate the following class java util package
    a.Vector class
    b.Stack class
    c.Hashtable class
    d.Random class 
*/

package Lab9;

import java.util.Vector;
import java.util.Stack;
import java.util.Hashtable;
import java.util.Random;
public class JavaUtilPacakgeEx {
    public static void main(String[] args) {

        //a. Vector class
        Vector vt = new Vector();
        System.out.println("VECTOR CLASS:\n");
        vt.add(12); vt.add(92); vt.add(49); vt.add(83); vt.add(53);
        System.out.println("Vector Elements: "+vt);
        System.out.println("Vector Size: "+vt.size());
        System.out.println("Value at index 2: "+vt.get(2));
        System.out.println("Index of 49: "+vt.indexOf(49));
        vt.remove(2);
        System.out.println("Vector Element after removed index 2 element: "+vt);
        vt.removeAllElements();
        System.out.println("Vector Elements: "+vt);
        
        //b. Stack class
        Stack st = new Stack();
        System.out.println("\nSTACK CLASS:\n");
        st.push(23); st.push(65); st.push(64); st.push(42); st.push(32);
        System.out.println("Stack Elements: "+st);
        System.out.println("Stack top element: "+st.peek());
        System.out.println("Stack Size: "+st.size());
        st.pop();
        System.out.println("Stack Elements after pop: "+st);
        System.out.println("Search element 64: "+st.search(64));
        
        //c. Hashtable class
        Hashtable ht = new Hashtable();
        System.out.println("\nHASHTABLE CLASS:\n");
        ht.put(201,"Data Structure and Algorithm");
        ht.put(202,"Probability and Statistics");
        ht.put(203,"System Analysis and Design");
        ht.put(204,"OOP in Java");
        ht.put(205,"Web Technology");
        
        System.out.println("Elements in Hashtable: "+ht);
        System.out.println("The size of Hashtable: "+ht.size());
        System.out.println("The value at key 203: "+ht.get(203));
        ht.remove(203);
        System.out.println("Elements in Hashtable after removing 203: "+ht);
        ht.clear();
        System.out.println("Elements in Hashtable: "+ht);
        
        //d. Random class
        Random r = new Random();
        
        System.out.println("\nRANDOM CLASS:\n");
        int n = r.nextInt(1,100);
        System.out.println("Random Int(1,100): "+n);
        
        float f = r.nextFloat(0.0f,10.0f);
        System.out.println("Random Float(0.0f,10.0f): "+f);
        
        double d = r.nextDouble(0.32,20.67);
        System.out.println("Random Double(0.32,20.5): "+d);
        
        boolean b = r.nextBoolean();
        System.out.println("Random Boolean: "+b);
    }
}
