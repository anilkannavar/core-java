package fcom.xworkz.flipkartshopping;

import java.sql.*;

public class FlipkartApllicationFetch {
	
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
		Connection connection=null;
		Statement statement=null;
		
		String fetchQuery="select * from flipkart";
		
		
		try {
			Connection connection1=DriverManager.getConnection(jdbcurl,username,password);
			Statement statement1=connection1.createStatement();
			ResultSet result=statement1.executeQuery(fetchQuery);
			System.out.println(result);
			System.out.println("Query fetched successfully.....");
			while(result.next()) 
			{
				System.out.println(result.getInt("id"));
				System.out.println(result.getString("itemname"));
				System.out.println(result.getString("company"));
				System.out.println(result.getString("address"));

			}
		} catch (SQLException e) {
                    throw new RuntimeException(e);
		}finally {
			try {
				connection.close();
			} catch (SQLException e2) {
                    throw new RuntimeException(e2);
			}
			try {
				statement.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
		
}


