package fcom.xworkz.flipkartshopping;

import java.sql.*;

public class FlipkartApplicationDelete {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcurl="jdbc:mysql://localhost:3306/shoppingapplication";
		String username="root";
		String password="Xworkzodc@123";
		
		String deleteQuery="delete from flipkart where id=1";

		
		try {
			Connection connection=DriverManager.getConnection(jdbcurl,username,password);
			Statement statement=connection.createStatement();
			boolean result=statement.execute(deleteQuery);
			System.out.println("Query deleted successfully.....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
