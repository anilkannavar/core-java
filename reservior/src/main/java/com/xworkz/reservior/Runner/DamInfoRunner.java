package com.xworkz.reservior.Runner;

import com.xworkz.reservior.dto.DamInfo;
import com.xworkz.reservior.service.DamInfoService;
import com.xworkz.reservior.service.DamInfoServiceImple;

public class DamInfoRunner {
	
	public static void main(String[] args) {
		
//		DamInfo damInfo=new DamInfo(1,"Bhdravathi","karnataka",2000);
//		DamInfo damInfo1=new DamInfo(2,"Krs","Mysore",3000);
//		
		DamInfoService damInfoService=new DamInfoServiceImple();
//		damInfoService.insert(damInfo);
//        damInfoService.insert(damInfo1);
        
//        damInfoService.update("Hospete", "Ballari", 3000);
        
        DamInfo damInfo= damInfoService.select("Bhdravathi");
      if(damInfo==null)
      {
    	  System.out.println("data has not been fetched");
      }else {
		System.out.println("successfully exist"+damInfo.getPlace());
	}
	}

}
