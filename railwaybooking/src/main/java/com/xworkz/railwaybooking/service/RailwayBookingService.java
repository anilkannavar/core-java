package com.xworkz.railwaybooking.service;

import java.util.List;

import com.xworkz.railwaybooking.dto.RailwayBooking;

public interface RailwayBookingService {
	
	public void insert(RailwayBooking booking);
	
	public void insertAll(List<RailwayBooking> booking1);
	
	public void update(String train_name,String source,String destination);
	
	public void updateAll(List<RailwayBooking> boking3);
	
	public void delete(RailwayBooking booking4);
	
	public RailwayBooking select(String destination);

	public List<RailwayBooking> selectAll();

}
