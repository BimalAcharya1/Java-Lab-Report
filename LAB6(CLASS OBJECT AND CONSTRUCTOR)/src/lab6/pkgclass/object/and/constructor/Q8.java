/* 8.Wap in java to implement member inner class and static inner class */

class OuterClass {
    class MemberInnerClass {
        void display() {
            System.out.println("Inside the Member Inner Class");
        }
    }
    
    static class StaticInnerClass {
        void display() {
            System.out.println("Inside the Static Inner Class");
        }
    }

    void showMessage() {
        System.out.println("Inside the Outer Class method");
    }
}

public class Q8 {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass(); 
        OuterClass.MemberInnerClass memberInner = outer.new MemberInnerClass(); 
        memberInner.display();
       
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.display(); 
        
      
        outer.showMessage(); 
    }
}
