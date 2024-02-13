package fcom.xworkz.flipkartshopping;

import java.applet.Applet;
import java.sql.*;

public class FlipkartApplicationInsert {
	
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
		
		String insertQuery="insert into flipkart values(21,'Apple phone','apple','US')";
		String insertQuery1="insert into flipkart values(2,'galaxy','smasung','southkorea')";
		String insertQuery2="insert into flipkart values(3,'kettle','milton','US')";
		String insertQuery3="insert into flipkart values(4,'note pro','realme','china')";
		String insertQuery4="insert into flipkart values(5,'bottle','prestige','india')";
		String insertQuery5="insert into flipkart values(6,'bedsheet','nmk','india')";
		String insertQuery6="insert into flipkart values(7,'wahing machine','goodrej','japan')";
		String insertQuery7="insert into flipkart values(8,'fridge','lg','australia')";
		String insertQuery8="insert into flipkart values(9,'belt','woodland','denmark')";
		String insertQuery9="insert into flipkart values(10,'slipper','adidas','germany')";


		
		try {
			Connection connection=DriverManager.getConnection(jdbcurl,username,password);
			Statement statement=connection.createStatement();
			
		    boolean result=statement.execute(insertQuery);
		    boolean result1=statement.execute(insertQuery1);
		    boolean result2=statement.execute(insertQuery2);
		    boolean result3=statement.execute(insertQuery3);
		    boolean result4=statement.execute(insertQuery4);
		    boolean result5=statement.execute(insertQuery5);
		    boolean result6=statement.execute(insertQuery6);
		    boolean result7=statement.execute(insertQuery7);
		    boolean result8=statement.execute(insertQuery8);
		    boolean result9=statement.execute(insertQuery9);
		    
		    System.out.println("Queries inserted successfully.....");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
