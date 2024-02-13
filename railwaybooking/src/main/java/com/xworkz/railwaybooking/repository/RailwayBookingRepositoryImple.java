package com.xworkz.railwaybooking.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.railwaybooking.dto.RailwayBooking;

public class RailwayBookingRepositoryImple implements RailwayBookingRepository {

	@Override
	public void insert(RailwayBooking booking) {
      try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      String jdbc="jdbc:mysql://localhost:3306/station";
      String username="root";
      String password="Xworkzodc@123";
      
      String insertQuery="insert into railway values(?,?,?,?,?)";
      
      
      try {
		Connection connection=DriverManager.getConnection(jdbc, username, password);
		PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1,booking.getId());
		preparedStatement.setString(2, booking.getTrain_name());
		preparedStatement.setString(3, booking.getSource());
		preparedStatement.setString(4,booking.getDestination());
		preparedStatement.setInt(5, booking.getPrice());
		preparedStatement.execute();
		System.out.println("inserted successfully...");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}

	@Override
	public void insertAll(List<RailwayBooking> booking1) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String jdbc="jdbc:mysql://localhost:3306/station";
	      String username="root";
	      String password="Xworkzodc@123";
	      
	      String updateQuery="insert into railway values(?,?,?,?,?)";
	      
	      
	      try {
			Connection connection=DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
			for (RailwayBooking railwayBooking : booking1) {
				preparedStatement.setInt(1,railwayBooking.getId());
				preparedStatement.setString(2, railwayBooking.getTrain_name());
				preparedStatement.setString(3, railwayBooking.getSource());
				preparedStatement.setString(4,railwayBooking.getDestination());
				preparedStatement.setInt(5, railwayBooking.getPrice());
				preparedStatement.execute();
				System.out.println("inserted data successfully...");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void update(String train_name, String source, String destination) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String jdbc="jdbc:mysql://localhost:3306/station";
	      String username="root";
	      String password="Xworkzodc@123";
	      
	      String updateQuery="update railway set source=?,destination=? where train_name=?";
	      
	      
	      try {
			Connection connection=DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
				preparedStatement.setString(1,source);
				preparedStatement.setString(2,destination);
				preparedStatement.setString(3,train_name );
				preparedStatement.executeUpdate();
				System.out.println(" data updated successfully successfully...");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void updataAll(List<RailwayBooking> boking3) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String jdbc="jdbc:mysql://localhost:3306/station";
	      String username="root";
	      String password="Xworkzodc@123";
	      
	      String updateQuery="update railway set source=?,destination=? where train_name=?";
	      
	      
	      try {
			Connection connection=DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
			for (RailwayBooking railwayBooking : boking3) {
				preparedStatement.setString(1,railwayBooking.getSource());
				preparedStatement.setString(2, railwayBooking.getDestination());
				preparedStatement.setString(3, railwayBooking.getTrain_name());
				preparedStatement.execute();
				System.out.println("update all data successfully...");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(RailwayBooking booking4) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String jdbc="jdbc:mysql://localhost:3306/station";
	      String username="root";
	      String password="Xworkzodc@123";
	      
	      String updateQuery="delete from railway where train_name=?";
	      
	      
	      try {
			Connection connection=DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
				preparedStatement.setString(1,booking4.getTrain_name());
				preparedStatement.execute();
				System.out.println(" data deleted successfully...");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public RailwayBooking select(String destination) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String jdbc="jdbc:mysql://localhost:3306/station";
	      String username="root";
	      String password="Xworkzodc@123";
	      
	      String Query="select * from railway where destination=?";
	      ResultSet resultset=null;
	      RailwayBooking railwayBooking=new RailwayBooking();
	      
	      try {
			Connection connection=DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareStatement(Query);
		     
			
				preparedStatement.setString(1,destination);
			 resultset=	preparedStatement.executeQuery();
			 if(resultset.next()) {
				     System.out.println(resultset.getString("destination"));
				     railwayBooking.setDestination(resultset.getString("destination"));
				     railwayBooking.setSource(resultset.getString("source"));
				     railwayBooking.setId(resultset.getInt("price"));
				     railwayBooking.setId(resultset.getInt("id"));
			}
				System.out.println(" data fetch successfully...");			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	      		return railwayBooking;
	}

	@Override
	public List<RailwayBooking> selectAll() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String jdbc="jdbc:mysql://localhost:3306/station";
	      String username="root";
	      String password="Xworkzodc@123";
	      
	      String Query="select * from railway";
	      ResultSet resultset=null;
	      RailwayBooking railwayBooking=new RailwayBooking();
	      List<RailwayBooking> list=new ArrayList();
	      
	      try {
			Connection connection=DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareStatement(Query);
			resultset=	preparedStatement.executeQuery();
			 while(resultset.next()) {
				     System.out.println(resultset.getString("destination"));
				     railwayBooking.setDestination(resultset.getString("destination"));
				     railwayBooking.setSource(resultset.getString("source"));
				     railwayBooking.setId(resultset.getInt("price"));
				     railwayBooking.setId(resultset.getInt("id"));
				     list.add(railwayBooking);
			}
				System.out.println(" All data fetch successfully...");			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		return list;
	}

	
	

}
