package bank_application;

import java.sql.*;


public class BankApplicationDelete {
	
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
		Connection connection1=null;
		PreparedStatement preparedStatement1=null;
		 
		String deleteQuery="delete from bank where location=? and name=?";
		
		try {
			 connection1=DriverManager.getConnection(jdbcurl,username,password);
			  preparedStatement1=connection1.prepareStatement(deleteQuery);
			preparedStatement1.setString(1, "chitradurga");
			preparedStatement1.setString(2, "aixs");
			preparedStatement1.addBatch();
			
			preparedStatement1.setString(1, "hgb");
			preparedStatement1.setString(2, "SBI");
			preparedStatement1.addBatch();
			
			preparedStatement1.executeBatch();	
			System.out.println("query has been deleted");
		} catch (SQLException e) {
             throw new RuntimeException(e);
		}finally {
			try {
				connection1.close();
			} catch (SQLException e) {
             throw new RuntimeException(e);
			}
			try {
				preparedStatement1.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
	}


