/* 4.Write a java program to develop multithreaded application by following ways 
a. By implementing Runnable Interface 
b. By extending Thread class. 
*/

package Lab8;

class MultiThread extends Thread{
    public void run(){
        System.out.println("Thread name: "+Thread.currentThread().getName()+" and priority: "+Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MultiThread ft = new MultiThread();
        MultiThread st = new MultiThread();
        ft.setName("First");
        st.setName("Second");
        ft.setPriority(1);
        st.setPriority(10);
        ft.start();
        st.start();
    }
}
