

/* 2021->Q11)-> what is jdbc?Write a java program to connect database Company and insert 5 employee record(Eid,Ename,salary,Department)in 
Employee table and display the employee record who's Department is 'Sales'.
* */



package lab10;

import java.sql.*;

public class DatabaseConnect{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String password = ""; // Change if your MySQL has a password

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            try ( // Connect to database
                Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connected to database!");

                // Insert 5 employee records
                String insertSQL = "INSERT INTO Employee (Eid, Ename, Salary, Department) VALUES (?, ?, ?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                    // Changed salary type in the array to Double
                    Object[][] employees = {
                        {101, "Alice", 50000.0, "Sales"}, // Changed to double
                        {102, "Bob", 55000.0, "IT"},     // Changed to double
                        {103, "Charlie", 48000.0, "Sales"}, // Changed to double
                        {104, "David", 60000.0, "HR"},     // Changed to double
                        {105, "Eva", 52000.0, "Sales"}     // Changed to double
                    };

                    for (Object[] emp : employees) {
                        pstmt.setInt(1, (int) emp[0]);
                        pstmt.setString(2, (String) emp[1]);
                        // Fix: Cast to Double (or double) for Salary
                        pstmt.setDouble(3, (Double) emp[2]);
                        pstmt.setString(4, (String) emp[3]);
                        pstmt.executeUpdate();
                    }

                    System.out.println("Inserted 5 employee records.");

                    // Retrieve and display employees from Sales department
                    String selectSQL = "SELECT * FROM Employee WHERE Department = 'Sales'";
                    try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(selectSQL)) {

                        System.out.println("\nEmployees in Sales Department:");
                        System.out.println("Eid\tEname\t\tSalary\t\tDepartment");
                        System.out.println("--------------------------------------------------");
                        while (rs.next()) {
                            int id = rs.getInt("Eid");
                            String name = rs.getString("Ename");
                            double salary = rs.getDouble("Salary");
                            String dept = rs.getString("Department");

                            System.out.printf("%d\t%-10s\t%.2f\t\t%s\n", id, name, salary, dept);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database error occurred: " + e.getMessage());
        } catch (ClassCastException e) { // Added specific catch for ClassCastException
            System.err.println("ClassCastException: " + e.getMessage());
            System.err.println("Please check data types in the 'employees' array and their corresponding PreparedStatement setters.");
        }
    }
}