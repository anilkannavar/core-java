package com.xworkz.railwaybooking.service;

import java.util.Iterator;
import java.util.List;

import com.xworkz.railwaybooking.dto.RailwayBooking;
import com.xworkz.railwaybooking.repository.RailwayBookingRepository;
import com.xworkz.railwaybooking.repository.RailwayBookingRepositoryImple;

public class RailwayBookingServiceImple implements RailwayBookingService{
    RailwayBookingRepository railwayBookingRepository=new RailwayBookingRepositoryImple();

	@Override
	public void insert(RailwayBooking booking) {
       if (booking.getId()==0 || booking.getTrain_name().isEmpty() || booking.getTrain_name()==null) {
    	   System.out.println("plesa enter train name");
		
	}else {
		railwayBookingRepository.insert(booking);
	}
	}

	@Override
	public void insertAll(List<RailwayBooking> booking1) {
        for (RailwayBooking railwayBooking : booking1) {
			if (railwayBooking.getId()==0) {
				System.out.println("please insert data");
			}
		} 
		railwayBookingRepository.insertAll(booking1);
	}

	@Override
	public void update(String train_name, String source, String destination) {

		if (train_name==null||source==null||destination==null) {
			System.out.println("please update data");
		}else {
			railwayBookingRepository.update(train_name, source, destination);
		}
	}

	@Override
	public void updateAll(List<RailwayBooking> boking3) {

		for (RailwayBooking railwayBooking : boking3) {
			if (railwayBooking.getSource()==null||railwayBooking.getDestination()==null||railwayBooking.getTrain_name()==null) {
				System.out.println("please update data");
			}
			
		}
		railwayBookingRepository.updataAll(boking3);
	}

	@Override
	public void delete(RailwayBooking booking4) {
		if(booking4.getTrain_name()==null) {
			System.out.println("data has not been deleted");
		}else {
			System.out.println("data has been deleted");
			railwayBookingRepository.delete(booking4);
		}
		
	}

	@Override
	public RailwayBooking select(String destination) {
       if (destination==null) {
		System.out.println("please fetch data ");
	}
       else {
		System.out.println("data fetch successfully");
		RailwayBooking railwayBooking=railwayBookingRepository.select(destination);
		return railwayBooking;
	}
		return null;
	}

	@Override
	public List<RailwayBooking> selectAll() {
        List<RailwayBooking> list=railwayBookingRepository.selectAll();
		return list;
	}
	

}
