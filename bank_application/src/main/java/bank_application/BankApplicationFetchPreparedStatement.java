package bank_application;

import java.sql.*;

import javax.management.RuntimeErrorException;
public class BankApplicationFetchPreparedStatement {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/bankapplication";
		String username="root";
		String password="Xworkzodc@123";
		String Query="select * from bank where name=? or location=?";
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		try {
			connection= DriverManager.getConnection(url,username,password);
		    preparedStatement=connection.prepareStatement(Query);
			preparedStatement.setString(1, "kotak");
			preparedStatement.setString(2, "harihar");
			ResultSet resultSet=preparedStatement.executeQuery();
            System.out.println(resultSet);
            while (resultSet.next()) 
            {
				System.out.println(resultSet.getString("name"));
				System.out.println(resultSet.getString("location"));
				System.out.println("query selected successfully....");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (Exception e2) {
                     throw new RuntimeException(e2);
				}finally {
					if(preparedStatement!=null)
					{
						try {
							preparedStatement.close();
						} catch (Exception e3) {
                              throw new RuntimeException(e3);
						}
					}
				}
			}
			
		
		}
	}

}
