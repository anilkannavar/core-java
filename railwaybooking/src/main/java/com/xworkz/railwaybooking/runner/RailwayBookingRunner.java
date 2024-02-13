package com.xworkz.railwaybooking.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.railwaybooking.dto.RailwayBooking;
import com.xworkz.railwaybooking.service.RailwayBookingService;
import com.xworkz.railwaybooking.service.RailwayBookingServiceImple;

public class RailwayBookingRunner {
	
	public static void main(String[] args) {
		
		RailwayBooking railwayBooking=new RailwayBooking(1,"janshatabdi","banglore","dvg",200);
		RailwayBooking railwayBooking1=new RailwayBooking(4,"bb","banglore","tumkur",400);
		RailwayBooking railwayBooking2=new RailwayBooking(5,"gg","banglore","bijapur",600);

        RailwayBookingService railwayBookingService=new RailwayBookingServiceImple();
//        railwayBookingService.insert(railwayBooking);
        
//        List<RailwayBooking> list=new ArrayList<RailwayBooking>();
//        list.add(railwayBooking1);
//        list.add(railwayBooking2);
//        railwayBookingService.insertAll(list);
       
//        railwayBookingService.update("mysore", "davangere", "gg");
        RailwayBooking railwayBooking4=new RailwayBooking(4,"sk","tt","rnr",400);
		RailwayBooking railwayBooking5=new RailwayBooking(5,"gg","harihar","dvg1",600);

//        List<RailwayBooking> list=new ArrayList<RailwayBooking>();
//        list.add(railwayBooking4);
//        list.add(railwayBooking5);
//        railwayBookingService.updateAll(list);
          
//          railwayBookingService.delete(railwayBooking4);
          
//          RailwayBooking railwayBooking6= railwayBookingService.select("dvg");
//          if(railwayBooking6==null)
//          {
//        	  System.out.println("enter data");
//          }else {
//			System.out.println("successfully exist"+railwayBooking6.getDestination());
//		}
          
          List<RailwayBooking> list=railwayBookingService.selectAll();
          list.forEach(ref->{
        	  System.out.println(ref.getDestination());
        	  System.out.println(ref.getId());
        	  System.out.println(ref.getPrice());
        	  System.out.println(ref.getSource());
        	  System.out.println(ref.getTrain_name());
          });
          
        }

}
