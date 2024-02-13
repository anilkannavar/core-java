package com.xworkz.ticketbookingapplication.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.ticketbookingapplication.dto.FlightBookingDTO;
import com.xworkz.ticketbookingapplication.repository.FlightBookingRepository;
import com.xworkz.ticketbookingapplication.repository.FlightBookingRepositoryImple;
import com.xworkz.ticketbookingapplication.service.FlightBookingService;
import com.xworkz.ticketbookingapplication.service.FlightBookingServiceImple;

public class FlightBookingRunner {
	
	public static void main(String[] args) {
		
		FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImple(); 
		
		FlightBookingDTO flightBookingDTO=new FlightBookingDTO("Air India", "Bnaglore", "Goa", 5000);
//		flightBookingRepository.saveFlightBookingDetails(flightBookingDTO);
		
		FlightBookingService flightBookingService=new FlightBookingServiceImple();
//		flightBookingService.save(flightBookingDTO);
		flightBookingService.update("Airways", "banglore", "mumbai");
//		flightBookingService.deleteByFlightName("Air India");
		
		List<FlightBookingDTO> flightBookingDTOs=new ArrayList<FlightBookingDTO>();
	    FlightBookingDTO flightBookingDTO2=new FlightBookingDTO("Indigo", "Banglore", "Delhi", 12000);
	    FlightBookingDTO flightBookingDTO3=new FlightBookingDTO("Air India", "Banglore", "Chennai", 7000);
        flightBookingDTOs.add(flightBookingDTO2);
        flightBookingDTOs.add(flightBookingDTO3);
//        flightBookingService.saveAll(flightBookingDTOs);
        
        
        
			
			
	}

}
