package bank_application;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;


public class BankApplication {
	
	public static void main(String[] args) {
		
		//load and register to driver:
		try {
			Class.forName("com.mysql.jdbc.Driver");   //forname is a static method in a class //driver is a interface
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//connecting database:
		String urlString="jdbc:mysql://localhost:3306/bankapplication";
		String usernameString="root";
		String passwordString="Xworkzodc@123";
		
		
		String updatequery="update bank set name=? where location=? and ifsc=?";
		
		try {
			//create statement:
			//driver manager is a class
			//getting the get connection
			Connection connection=DriverManager.getConnection(urlString,usernameString,passwordString);
		    PreparedStatement preparedStatement=connection.prepareStatement(updatequery);//connection get from getconnetion interface
		    //execute query:
		    preparedStatement.setString(1, "csb");
		    preparedStatement.setString(2, "banglore");
		    preparedStatement.setString(3, "SBI0000702");
		    preparedStatement.addBatch();

		    preparedStatement.setString(1, "kshathriya");
		    preparedStatement.setString(2, "channagiri");
		    preparedStatement.setString(3, "SBI0000701");
		    preparedStatement.addBatch();
		    
		    preparedStatement.executeBatch();


			
			System.out.println("updated data into bank");
			System.out.println("connected successfull....");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	

}
