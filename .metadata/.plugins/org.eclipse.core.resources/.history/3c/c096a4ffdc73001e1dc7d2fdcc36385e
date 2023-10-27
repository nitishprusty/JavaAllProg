package com.jdbc.assignment;
import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args) {

           try {
        	   
        	   Class.forName("com.mysql.jdbc.Driver");
        	   String username = "root";
        	   String password = "root";
        	   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccTraining",username,password);
        	   Statement statement = connection.createStatement();
        	   
        	   //insert 4 rows
        	   
        	   String statement1 = "INSERT INTO Product VALUES(1,'SmartPhone','Description for SmartPhone',18000,'Electronic-device'),(2,'Jeans','Description for Jeans',2000,'Clothing'),(3,'Shirt','Description for Shirt',3000,'Clothing'),(4,'Trimmer','Description for Trimmer',5000,'Electronic-device')";
        	   int result = statement.executeUpdate(statement1);
        	   System.out.println(result + " rows affected");
        	   
        	   
        	   //view data
        	   String viewQuery = "SELECT * FROM Product";
        	   ResultSet resultset = statement.executeQuery(viewQuery);
        	           	   while(resultset.next()) {
        		   System.out.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getString(3) + " " + resultset.getInt(4) + " " + resultset.getString(5));
        		   
        	   }
        	   
        	   //update data
        	   String updateQuery = "UPDATE Product set ProdName = 'Cadbury DairyMilk',Price = 250,Category = 'Choclate' order by ProdId desc LIMIT 2";
        	   int result2 = statement.executeUpdate(updateQuery);
        	   System.out.println(result2 + " rows updated");
        	   
        	   //delete data
        	   String deleteQuery = "DELETE FROM Product ORDER BY Price asc limit 1";
        	   int result3 = statement.executeUpdate(deleteQuery);
        	   System.out.println(result3 + " rows deleted");
        	   
        	   connection.close();
        	   statement.close();
        	   
        	   
        	   
           }catch(Exception e) {
        	   e.printStackTrace();
           }

	}

}
