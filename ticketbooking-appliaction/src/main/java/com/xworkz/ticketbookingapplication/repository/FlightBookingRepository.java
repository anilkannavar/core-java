package com.xworkz.ticketbookingapplication.repository;

import java.util.List;

import com.xworkz.ticketbookingapplication.dto.FlightBookingDTO;

public interface FlightBookingRepository {
	
	public void saveFlightBookingDetails(FlightBookingDTO booking);
	
	public void saveAll(List<FlightBookingDTO> bookings);
	
	public void update(String flightName,String flightSource,String flightDestination);
	
	public void deleteByFlightName(String flightName);
	
	
	
	public List<FlightBookingDTO> findAll();
	

	
}
