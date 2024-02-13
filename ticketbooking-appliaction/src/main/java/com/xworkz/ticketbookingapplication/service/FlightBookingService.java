package com.xworkz.ticketbookingapplication.service;

import java.util.List;

import com.xworkz.ticketbookingapplication.dto.FlightBookingDTO;

public interface FlightBookingService{
	 void save(FlightBookingDTO booking);
	 
	 void saveAll(List<FlightBookingDTO> bookings);
	 
	 void update(String flightName,String flightSource,String flightDestination);
	 
	  void deleteByFlightName(String flightName);

}
