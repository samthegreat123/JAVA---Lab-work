//47. Write a JDBC program to Delete data into Oracle Table..

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDeleteExample {
    public static void main(String[] args) {
       
        String url = "jdbc:mysql://localhost:3306/Test01";
        String user = "root";
        String password = ""; 

       
        String sql = "DELETE FROM users WHERE id = ?";

        
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.");

            
            Connection cn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully.");

           
            PreparedStatement pstmt = cn.prepareStatement(sql);
            
            
            pstmt.setInt(1, 1); 

            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully! Rows affected: " + rowsAffected);
            } else {
                System.out.println("No matching record found to delete.");
            }

           
            pstmt.close();
            cn.close();
            System.out.println("Connection closed.");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection or query error.");
            e.printStackTrace();
        }
    }
}