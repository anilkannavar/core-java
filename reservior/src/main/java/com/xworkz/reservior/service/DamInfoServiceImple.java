package com.xworkz.reservior.service;

import com.xworkz.reservior.dto.DamInfo;
import com.xworkz.reservior.repository.DamInfoRepository;
import com.xworkz.reservior.repository.DamInfoRepositoryImple;

public class DamInfoServiceImple implements DamInfoService{
	DamInfoRepository damInfoRepository=new DamInfoRepositoryImple();

	@Override
	public void insert(DamInfo damInfo) {

		if(damInfo.getId()==0||damInfo.getPlace().isEmpty()) {
			System.out.println("please enter the value");
		}else {
			System.out.println("inserted successfully....");
			damInfoRepository.insert(damInfo);
		}
	}

	@Override
	public void update(String Place, String State, int Height) {

		if(Place==null||State==null) {
			System.out.println("plesase update data");
		}else {
			System.out.println("data updated successfully");
			damInfoRepository.update(Place, State, Height);
		}
		
	}

	@Override
	public DamInfo select(String place) {

		if (place==null) {
			System.out.println("data has not beeen fetched");
			
		}else {
			System.out.println("data fetch successfully");
			DamInfo damInfo=damInfoRepository.select(place);
			return damInfo;
		}
		return null;
	}

}
