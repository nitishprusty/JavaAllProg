package com.acc.lkm.jdbcdemo;
import java.sql.*;
public class JDBCDemo1 {
	
	public static void main(String [] args) {
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 String username = "root";
			 String password = "root";
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccTraining",username,password);
			 Statement statement = connection.createStatement();
			 
			 /*
			 String sql = "SELECT * FROM TRAINING";
			 ResultSet resultset = statement.executeQuery(sql);
			 
			 while(resultset.next()) {
				 System.out.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getString(3) + " " + resultset.getInt(4) + " " + resultset.getDate(5));
			 }
			 
			 String sql1 = "INSERT INTO TRAINING VALUES(4,'Salesforce','Accenture',26,'2023-11-21')";
			 int result = statement.executeUpdate(sql1);
			 System.out.println(result + " rows affected");
			 */
			 
			 String sql2 = "DELETE FROM TRAINING WHERE Trid = 4";
			 int deletedrows = statement.executeUpdate(sql2);
			 if(deletedrows > 1) {
				 System.out.println(deletedrows + " rows deleted");
			 }else {
				 System.out.println(deletedrows + " row deleted");
			 }
			 
			 
			 
			 connection.close();
			 statement.close();
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 System.out.println("Application closed");
		 }
	}

}
