package lab10;


import java.sql.*;
import java.util.Scanner;

class EmployeeCRUD {
    static final String DB_URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";     // Your DB username
    static final String PASS = ""; // Your DB password (replace with your actual password if not empty)

    static Connection conn = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC driver (necessary for older JDBC versions or if not automatically picked up)
            Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL 8.0+

            // Connect to database
            // Fix: Changed DE_URL to DB_URL
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to database.");

            int choice;
            do {
                System.out.println("\n--- Employee Management ---");
                System.out.println("1. Insert Employee");
                System.out.println("2. Display Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over after nextInt()

                switch (choice) {
                    case 1: insertEmployee(); break;
                    case 2: displayEmployees(); break;
                    case 3: updateEmployee(); break;
                    case 4: deleteEmployee(); break;
                    case 5: System.out.println("Exiting..."); break;
                    default: System.out.println("Invalid choice.");
                }
            } while (choice != 5);

            // Close connection when done
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Database connection closed.");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Error: MySQL JDBC Driver not found. Make sure it's in your classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection or operation error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Ensure scanner is closed
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static void insertEmployee() throws SQLException {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        String sql = "INSERT INTO Employee (Eid, Name, Address, Department) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, address);
            pstmt.setString(4, department);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) inserted.");
        }
    }

    public static void displayEmployees() throws SQLException {
        String sql = "SELECT * FROM Employee";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- Employee List ---");
            // Check if ResultSet is empty
            if (!rs.isBeforeFirst()) {
                System.out.println("No employees to display.");
                return;
            }

            // Print header
            System.out.printf("%-5s %-15s %-20s %-15s\n", "ID", "Name", "Address", "Department");
            System.out.println("------------------------------------------------------------");

            while (rs.next()) {
                System.out.printf("%-5d %-15s %-20s %-15s\n",
                    rs.getInt("Eid"),
                    rs.getString("Name"),
                    rs.getString("Address"),
                    rs.getString("Department"));
            }
        }
    }

    public static void updateEmployee() throws SQLException {
        System.out.print("Enter Employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter new Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter new Department: ");
        String department = scanner.nextLine();

        String sql = "UPDATE Employee SET Name=?, Address=?, Department=? WHERE Eid=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, department);
            pstmt.setInt(4, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                 System.out.println(rows + " row(s) updated.");
            } else {
                 System.out.println("No employee found with ID " + id + " to update.");
            }
        }
    }

    public static void deleteEmployee() throws SQLException {
        System.out.print("Enter Employee ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String sql = "DELETE FROM Employee WHERE Eid=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println(rows + " row(s) deleted.");
            } else {
                System.out.println("No employee found with ID " + id + " to delete.");
            }
        }
    }
}
