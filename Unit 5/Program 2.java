// Write a JDBC program to Display data into Oracle Table 
import java.sql.*;
class Display
{
  public static void main(String args[])
  {
     try
	 { 
	   class.forName("com.mysql.jdbc.Driver");
	   Connection cn = DriverManager.getconnection{
	   "jdbc:mysql://localhost:3306/Test01","root,"");
	   Statement stmt = cn.createStatement();
	   Resultset rs=stmt.executeQuery("select + from stud");
	   while(rs.next())
	   {
		   System.out.println(rs.geetInt("qrono")+"  "+rs.getString(
		     "name"));
			 
	   }
	      cn.close();
		  
	   }
	   
	     catch(Exception e)
		 {
			 System.out.println(e);
			 
		 }
		 
	 }
	 
  }