/*48. Write a JDBC program to Insert Records Into Oracle Table Using Prepared 
Statement.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsertExample {
    public static void main(String[] args) {
       
        String url = "jdbc:mysql://localhost:3306/Test01";
        String user = "root";
        String password = "";

       
        String sql = "INSERT INTO users (username, email) VALUES (?, ?)";

        try {
     
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.");

         
            Connection cn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully.");

          
            PreparedStatement pstmt = cn.prepareStatement(sql);
            
           
            pstmt.setString(1, "AliceSmith");          
            pstmt.setString(2, "alice@example.com");    

            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully! Rows affected: " + rowsAffected);
            } else {
                System.out.println("Failed to insert record.");
            }

          
            pstmt.close();
            cn.close();
            System.out.println("Connection closed.");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection or query error.");
            e.printStackTrace();
        }
    }
}