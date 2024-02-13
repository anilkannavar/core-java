package com.xworkz.institute.Runner;

import com.xworkz.institute.dto.CollegeInstituteDto;
import com.xworkz.institute.repository.CollegeInstituteRepository;
import com.xworkz.institute.service.CollegeInstitueService;
import com.xworkz.institute.service.CollegeInstituteServiceImple;

public class CollegeInstituteRunner {
	
	public static void main(String[] args) {
		
		CollegeInstituteDto collegeInstituteDto=new CollegeInstituteDto(1,"gmit","davg",345,"davangere");
		CollegeInstituteDto collegeInstituteDto1=new CollegeInstituteDto(2,"biet","rnr",897,"durga");
		
		CollegeInstitueService collegeInstitueService=new CollegeInstituteServiceImple();
		collegeInstitueService.add(collegeInstituteDto);
		collegeInstitueService.add(collegeInstituteDto1);

	}

}
