/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

class evenThread implements Runnable{
    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println("Even number from 1-50: "+i);
            }
        }
    }
}

class oddThread implements Runnable{
    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2!=0){
                System.out.println("Odd number from 1-50: "+i);
            }
        }
    }
}

class numberThread extends Thread{
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println("Number from 1-50: "+i);
        }
    }
}

class primeThread extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            boolean isPrime=true;
            for(int j=2;j<=100;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime number: "+i);
            }
        }
    }
}

public class MultiThreadedApp {
    public static void main(String[] args) {
        Thread t1 = new Thread(new evenThread());
        Thread t2 = new Thread(new oddThread());
        t1.start();
        t2.start();
        
        numberThread t3 = new numberThread();
        primeThread t4 = new primeThread();
        t3.start();
        t4.start();
    }
}
