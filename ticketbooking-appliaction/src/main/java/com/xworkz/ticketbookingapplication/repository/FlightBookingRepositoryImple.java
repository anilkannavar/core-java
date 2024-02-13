package com.xworkz.ticketbookingapplication.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.ticketbookingapplication.dto.FlightBookingDTO;

public class FlightBookingRepositoryImple implements FlightBookingRepository{

	@Override
	public void saveFlightBookingDetails(FlightBookingDTO booking) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbc="jdbc:mysql://localhost:3306/ticketsystem";
		String username="root";
		String password="Xworkzodc@123";
		
		String insertquery="insert into airticket"+"(flight_name,source,destination,price)"+"values(?,?,?,?)";
		
		try {
			Connection connection=DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareStatement(insertquery);
			preparedStatement.setString(1, booking.getFlightname());
			preparedStatement.setString(2, booking.getSource());
			preparedStatement.setString(3, booking.getDestination());
			preparedStatement.setInt(4, booking.getPrice());

			preparedStatement.execute();
			
			System.out.println("Query inserted successfully....");


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void saveAll(List<FlightBookingDTO> bookings) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbc="jdbc:mysql://localhost:3306/ticketsystem";
		String username="root";
		String password="Xworkzodc@123";
		
		String insertquery="insert into airticket"+"(flight_name,source,destination,price)"+"values(?,?,?,?)";
		
		try {
			Connection connection=DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareStatement(insertquery);
			for (FlightBookingDTO flightBookingDTO : bookings) {
				preparedStatement.setString(1, flightBookingDTO.getFlightname());
				preparedStatement.setString(2, flightBookingDTO.getSource());
				preparedStatement.setString(3, flightBookingDTO.getDestination());
				preparedStatement.setInt(4, flightBookingDTO.getPrice());
				preparedStatement.execute();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void update(String flightName, String flightSource, String dflightDestination) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbc="jdbc:mysql://localhost:3306/ticketsystem";
		String username="root";
		String password="Xworkzodc@123";
		
		String updateQuery="update airticket set source=?, destination=? where flight_name=?";
				
		
		try {
			Connection	connection = DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareCall(updateQuery);
			preparedStatement.setString(1, flightSource);
			preparedStatement.setString(2, dflightDestination);
			preparedStatement.setString(3, flightName);
			preparedStatement.executeUpdate();
			System.out.println("updated query successfully......");

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	@Override
	public void deleteByFlightName(String flightName) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbc="jdbc:mysql://localhost:3306/ticketsystem";
		String username="root";
		String password="Xworkzodc@123";
		
		String deleteQuery="delete from airticket where flight_name=?";
		
		try {
			Connection	connection = DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareCall(deleteQuery);
			preparedStatement.setString(1,flightName );
			preparedStatement.execute();
			System.out.println("deleted query successfully........");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	@Override
	public List<FlightBookingDTO> findAll() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbc="jdbc:mysql://localhost:3306/ticketsystem";
		String username="root";
		String password="Xworkzodc@123";
		String query="select * from airticket";
		List<FlightBookingDTO> bookings=new ArrayList<>();
		FlightBookingDTO booking=null;
		try {
			Connection connection=DriverManager.getConnection(jdbc, username, password);
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			ResultSet resultset=preparedStatement.executeQuery();
		    while(resultset.next()) {
		    	System.out.println(resultset.getString(2));
		    	System.out.println(resultset.getString("source"));
		    	 booking=new FlightBookingDTO();
		    	booking.setFlightname(resultset.getFlightname());
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookings;
		
	}
}

