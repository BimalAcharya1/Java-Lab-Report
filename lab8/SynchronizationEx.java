/* 6.Write a java program to demonstrate the concept of synchronization in multithreaded applications. */
package Lab8;

class print {
    public synchronized void display(){
        try{
            System.out.print("This is ");
            Thread.sleep(2000);
            System.out.println("Synchronization Example."); 
        }catch(Exception ex){
            System.out.println("Exception: "+ex.getMessage());
        }
    }
}

class Thread1 extends Thread{
    print p;
    public Thread1(print p){
        this.p = p;
    }
    public void run(){
        p.display();
    }
}
public class SynchronizationEx {
    public static void main(String[] args) {
        print ptr = new print();
        Thread1 th1 = new Thread1(ptr);
        Thread1 th2 = new Thread1(ptr);
        th1.start();
        th2.start();
        
    }
}
