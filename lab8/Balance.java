/* 2.Write a java program that will read balance and withdraw amount from keyboard and display the remaining balance on screen if the balance 
is greater than withdraw amount otherwise throw an exception with appropriate amount message.  */


package Lab8;

import java.util.Scanner;

class BalException extends Throwable{
    public BalException(String msg){
        super(msg);
    }
}
public class Balance {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter balance:");
            double bal = sc.nextDouble();
            System.out.print("Enter amount to withdraw: ");
            double wit = sc.nextDouble();
            
            if(bal>wit){
                System.out.println("Remaining Balance: "+(bal-wit));
            }else{
                throw(new BalException ("Insufficient Balance."));
            }
        }
        catch(BalException | Exception ex){
            System.out.println("Exception: "+ex.getMessage());
        }
    }
}
