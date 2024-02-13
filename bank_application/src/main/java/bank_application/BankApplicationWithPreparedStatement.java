package bank_application;

import java.sql.*;

public class BankApplicationWithPreparedStatement {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcurl="jdbc:mysql://localhost:3306/bankapplication";
		String username="root";
		String password="Xworkzodc@123";
		
		
		Connection connection=null;
		PreparedStatement preparedStatement=null; 
		
		String queryInsert="insert into bank values(?,?,?,?)";
		
		try {
			connection=DriverManager.getConnection(jdbcurl,username,password);
			preparedStatement=connection.prepareStatement(queryInsert);
			preparedStatement.setInt(1,8);
			preparedStatement.setString(2, "World Bank");
			preparedStatement.setString(3, "US");
			preparedStatement.setString(4, "WB007896");
			preparedStatement.execute();
			preparedStatement.setInt(1, 20);
			preparedStatement.setString(2, "swiss bank");
			preparedStatement.setString(3, "SWITZERLAND");
			preparedStatement.setString(4, "SW00897621");
			preparedStatement.execute();
			System.out.println("inserted successfully......");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
