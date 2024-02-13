package com.xworkz.reservior.repository;

import com.xworkz.reservior.dto.DamInfo;

public interface DamInfoRepository {

	public void insert(DamInfo damInfo);
	
	public void update(String place,String state,int height);
	
	public DamInfo select(String place);
}
