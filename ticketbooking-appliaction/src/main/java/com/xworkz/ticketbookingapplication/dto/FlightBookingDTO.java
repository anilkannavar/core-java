package com.xworkz.ticketbookingapplication.dto;



public class FlightBookingDTO {
	
	
	private String flight_name;
	
	private String source;
	
	private String destination;
	
	private int price;
	
	

	public FlightBookingDTO(String flight_name, String source, String destination, int price) {
		super();
		this.flight_name = flight_name;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}

	public FlightBookingDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getFlightname() {
		return flight_name;
	}

	public void setFlightname(String flightname) {
		this.flight_name = flight_name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	
	

}
