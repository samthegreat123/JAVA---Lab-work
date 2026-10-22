//44. Write a JDBC program to Insert data into Oracle Table...

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleInsertDemo {
    // Oracle Database Connection Constants
    // Format for Thin driver: jdbc:oracle:thin:@host:port:SID or jdbc:oracle:thin:@//host:port/service_name
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        // SQL Insert Query with Placeholders (?)
        String sql = "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";

        // Try-with-resources ensures automatic closing of database resources
        try (
            // 1. Establish the Connection
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // 2. Create a PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            // Optional: Disable auto-commit if you want to handle transactions manually
            conn.setAutoCommit(false);

            // Set values for the parameters
            pstmt.setInt(1, 101);
            pstmt.setString(2, "Alice Smith");
            pstmt.setDouble(3, 75000.50);

            // 3. Execute the Insert Query
            int rowsAffected = pstmt.executeUpdate();
            
            // Commit the transaction
            conn.commit();

            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully! Rows affected: " + rowsAffected);
            }

        } catch (SQLException e) {
            System.out.println("Database connection or insertion failed!");
            e.printStackTrace();
        }
    }
}