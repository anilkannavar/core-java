package com.xworkz.reservior.service;

import com.xworkz.reservior.dto.DamInfo;

public interface DamInfoService {
	
	public void insert(DamInfo damInfo);
	
	public void update(String place,String state,int height);
	
	public DamInfo select(String place);


}
