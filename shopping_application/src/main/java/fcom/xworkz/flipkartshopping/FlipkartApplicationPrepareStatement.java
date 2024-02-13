package fcom.xworkz.flipkartshopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class FlipkartApplicationPrepareStatement {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/shoppingapplication";
		String username="root";
		String password="Xworkzodc@123";
		
		String updateQuery="update flipkart set itemname=?,company=? where address=?";
		
		try {
		   Connection connectin=DriverManager.getConnection(url,username,password);
		   PreparedStatement preparedStatement=connectin.prepareStatement(updateQuery);
		   
		   preparedStatement.setString(1, "chair");
		   preparedStatement.setString(2, "banglore");
		   preparedStatement.setString(3, "southkorea");
		   preparedStatement.execute();
		   
		   preparedStatement.setString(1, "sofa");
		   preparedStatement.setString(2, "davangere");
		   preparedStatement.setString(3, "US");
		   preparedStatement.execute();
		   
		   preparedStatement.setString(1, "bag");
		   preparedStatement.setString(2, "chitradurga");
		   preparedStatement.setString(3, "china");
		   preparedStatement.execute();
		   System.out.println("Query updates successfuly...");
		   
		   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

}
