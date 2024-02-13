package com.xworkz.institute.service;

import com.xworkz.institute.dto.CollegeInstituteDto;
import com.xworkz.institute.repository.CollegeInstituteRepository;
import com.xworkz.institute.repository.CollegeInstituteRepositoryImple;

public class CollegeInstituteServiceImple implements CollegeInstitueService{

	CollegeInstituteRepository collegeInstituteRepository=new CollegeInstituteRepositoryImple();
	
	@Override
	public void add(CollegeInstituteDto collegeInstituteDto) {
		if(collegeInstituteDto.getId()==0||collegeInstituteDto.getAddress().isEmpty()) {
			System.out.println("plesa einsert elements");
			
		}else {
			System.out.println("inserted successfully");
			collegeInstituteRepository.add(collegeInstituteDto);
		}
	}

}
