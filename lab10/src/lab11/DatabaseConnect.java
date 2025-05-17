package lab10;

import java.sql.*;
import java.util.Scanner;
public class DatabaseConnect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost/employee";
        String name = "root";
        String pass = "";
        System.out.print("Enter Eid: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String ename = sc.nextLine();
            System.out.print("Enter Address: ");
            String eaddr = sc.nextLine();
            System.out.print("Enter Department: ");
            String edep = sc.nextLine();
            
        String sql = "INSERT INTO employee('"+id+"',"+"'"+ename+"',"+"'"+eaddr+"',"+"'"+edep+"')";
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,name,pass);
            Statement st = con.createStatement();
 
            int row = st.executeUpdate(sql);
            if(row==1){
                System.out.println("Insert success.");
            }else{
                System.out.println("Insert failed.");
            }
            st.close();
            con.close();
            
        }
        catch(Exception ex){
            System.out.println("Exception: "+ex.getMessage());
        }
        
    }
}
