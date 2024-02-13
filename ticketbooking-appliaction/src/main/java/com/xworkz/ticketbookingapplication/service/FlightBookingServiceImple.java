package com.xworkz.ticketbookingapplication.service;

import java.util.List;

import com.xworkz.ticketbookingapplication.dto.FlightBookingDTO;
import com.xworkz.ticketbookingapplication.repository.FlightBookingRepository;
import com.xworkz.ticketbookingapplication.repository.FlightBookingRepositoryImple;

public class FlightBookingServiceImple implements FlightBookingService{
	
	FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImple();

	@Override
	public void save(FlightBookingDTO booking) 
	{
		if(booking.getFlightname().isEmpty()) {
			System.out.println("please enter the flight name hereeee");
		}else {
		flightBookingRepository.saveFlightBookingDetails(booking);
	}
	
	}

	@Override
	public void saveAll(List<FlightBookingDTO> booking) {
		boolean validBooking=true;
		for (FlightBookingDTO flightBookingDTO : booking) 
		{
			if (flightBookingDTO.getFlightname().isEmpty()) {
			
				
			
			System.out.println("please enter valid flight name");
			validBooking=false;
		}else {
		       flightBookingRepository.saveAll(booking);
        }
				
		}
       
	}

	@Override
	public void update(String flightName, String flightSource, String flightDestination) {
         FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImple();
         if (flightName==null||flightName.isEmpty()) {
			System.out.println("flightnme is empty");
		}else {
			flightBookingRepository.update(flightName, flightSource, flightDestination);
		}
		
	}

	@Override
	public void deleteByFlightName(String flightName) {

		FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImple();
        if (flightName==null||flightName.isEmpty()) {
			System.out.println("flightnme is empty");
		}else {
			flightBookingRepository.deleteByFlightName(flightName);
		}
		
		
	}	

}
