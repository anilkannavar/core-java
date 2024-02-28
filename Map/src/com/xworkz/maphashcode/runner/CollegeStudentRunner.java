package com.xworkz.maphashcode.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.maphashcodeandequals.CollegeDTO;
import com.xworkz.maphashcodeandequals.StudentDTO;

public class CollegeStudentRunner {
	
	public static void main(String[] args) {
		
		Map<CollegeDTO, StudentDTO> map=new HashMap<CollegeDTO, StudentDTO>();
		
		CollegeDTO collegeDTO=new CollegeDTO("ubdt", 1, "visweswarayya");
		CollegeDTO collegeDTO1 = new CollegeDTO("Stanford University", 1, "California");
		CollegeDTO collegeDTO2 = new CollegeDTO("Harvard University", 2, "Massachusetts");
		CollegeDTO collegeDTO3 = new CollegeDTO("Massachusetts Institute of Technology (MIT)", 3, "Massachusetts");
		CollegeDTO collegeDTO4 = new CollegeDTO("California Institute of Technology (Caltech)", 4, "California");
		CollegeDTO collegeDTO5 = new CollegeDTO("University of Cambridge", 5, "United Kingdom");
		CollegeDTO collegeDTO6 = new CollegeDTO("University of Oxford", 6, "United Kingdom");
		CollegeDTO collegeDTO7 = new CollegeDTO("ETH Zurich - Swiss Federal Institute of Technology", 7, "Switzerland");
		CollegeDTO collegeDTO8 = new CollegeDTO("University College London (UCL)", 8, "United Kingdom");
		CollegeDTO collegeDTO9 = new CollegeDTO("University of Chicago", 9, "Illinois");

		StudentDTO studentDTO=new StudentDTO("Anil", 421, 125.78);
		StudentDTO studentDTO1 = new StudentDTO("John Smith", 101, 85.5);
		StudentDTO studentDTO2 = new StudentDTO("Emily Johnson", 102, 92.3);
		StudentDTO studentDTO3 = new StudentDTO("Michael Williams", 103, 78.9);
		StudentDTO studentDTO4 = new StudentDTO("Sophia Brown", 104, 95.7);
		StudentDTO studentDTO5 = new StudentDTO("Daniel Jones", 105, 87.2);
		StudentDTO studentDTO6 = new StudentDTO("Olivia Davis", 106, 91.6);
		StudentDTO studentDTO7 = new StudentDTO("Matthew Miller", 107, 83.4);
		StudentDTO studentDTO8 = new StudentDTO("Emma Wilson", 108, 89.8);
		StudentDTO studentDTO9 = new StudentDTO("Alexander Taylor", 109, 94.1);
		
		
        map.put(collegeDTO, studentDTO);
        map.put(collegeDTO1, studentDTO1);
        map.put(collegeDTO2, studentDTO2);
        map.put(collegeDTO3, studentDTO3);
        map.put(collegeDTO4, studentDTO4);
        map.put(collegeDTO5, studentDTO5);
        map.put(collegeDTO6, studentDTO6);
        map.put(collegeDTO7, studentDTO7);
        map.put(collegeDTO8, studentDTO8);
        map.put(collegeDTO9, studentDTO9);
        
        
		CollegeDTO collegeDTO10 = new CollegeDTO("University of Chicago", 10, "Connecticut");
		StudentDTO studentDTO10 = new StudentDTO("Ava Martinez", 110, 82.7);
		
		
		map.put(collegeDTO10, studentDTO10);
		
		map.forEach((k,v)->System.out.println(k+ ":"+v));
    }

}
