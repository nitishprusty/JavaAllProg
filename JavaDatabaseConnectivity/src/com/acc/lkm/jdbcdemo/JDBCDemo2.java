package com.acc.lkm.jdbcdemo;
import java.sql.*;
public class JDBCDemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String username = "root";
			 String password = "root";
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccTraining",username,password);
//			 PreparedStatement preparedstatement = connection.prepareStatement("SELECT * FROM Training");
//			 ResultSet resultset = preparedstatement.executeQuery();
//			 while(resultset.next()) {
//				 System.out.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getString(3) + " " + resultset.getInt(4) + " " + resultset.getDate(5));
//			 }
			 
//			 PreparedStatement preparedstatement = connection.prepareStatement("INSERT INTO TRAINING VALUES(?,?,?,?,?)");
//			 
//			 preparedstatement.setInt(1, 5);
//			 preparedstatement.setString(2, "ReactJS");
//			 preparedstatement.setString(3, "Accenture");
//			 preparedstatement.setInt(4, 14);
//			 preparedstatement.setDate(5, java.sql.Date.valueOf("2023-11-18"));
//			 
//			 int res = preparedstatement.executeUpdate();
//			 System.out.println(res + " rows afftected");
//			 
			
			 
			 
//			 PreparedStatement preparedstatment = connection.prepareStatement("UPDATE Training set Trname = ?,Compname = ? where Trid = 5");
//			 preparedstatment.setString(1, "Python");
//			 preparedstatment.setString(2, "Cognizant");
//			 
//			 int res = preparedstatment.executeUpdate();
//			 System.out.println(res + " rows updated");
			 
			 PreparedStatement preparedstatement = connection.prepareStatement("DELETE FROM Training where Trid = ?");
			 preparedstatement.setInt(1,5);
			 
			 int result = preparedstatement.executeUpdate();
			 System.out.println(result + " rows deleted");
			 connection.close();
            preparedstatement.close();
			 
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
