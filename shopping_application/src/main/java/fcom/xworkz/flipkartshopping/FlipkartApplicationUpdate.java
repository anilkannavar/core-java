package fcom.xworkz.flipkartshopping;

import java.sql.*;

public class FlipkartApplicationUpdate {
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
		
		String updateQuery="Update flipkart set itemname='cooler' where id=1";
		String updateQuery1="Update flipkart set itemname='beer' where id=2";
		String updateQuery2="Update flipkart set itemname='sandals' where id=3";
		String updateQuery3="Update flipkart set itemname='laptop' where id=4";
		String updateQuery4="Update flipkart set itemname='tv' where id=5";
		String updateQuery5="Update flipkart set itemname='ups' where id=6";
		String updateQuery6="Update flipkart set itemname='projector' where id=7";
		String updateQuery7="Update flipkart set itemname='tiles' where id=8";
		String updateQuery8="Update flipkart set itemname='football' where id=9";
		String updateQuery9="Update flipkart set itemname='jersey' where id=10";
		
		try {
			Connection conection=DriverManager.getConnection(jdbcurl, username, password);
			Statement statement =conection.createStatement();
			statement.executeUpdate(updateQuery);
			statement.executeUpdate(updateQuery1);
			statement.executeUpdate(updateQuery2);
			statement.executeUpdate(updateQuery3);
			statement.executeUpdate(updateQuery4);
			statement.executeUpdate(updateQuery5);
			statement.executeUpdate(updateQuery6);
			statement.executeUpdate(updateQuery7);
			statement.executeUpdate(updateQuery8);
			statement.executeUpdate(updateQuery9);
			System.out.println("Query updated successfully...");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
