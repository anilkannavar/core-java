package com.xworkz.maphashcode.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.maphashcodeandequals.Capital;
import com.xworkz.maphashcodeandequals.CountryDTO;

public class CountryCapitalRunner {
	
	public static void main(String[] args) {
		
		Map<CountryDTO, Capital> map=new HashMap<CountryDTO, Capital>();
		
		CountryDTO countryDTO=new CountryDTO("India", 2000.0, 500);
		CountryDTO countryDTO1 = new CountryDTO("United States", 25000.0, 700);
		CountryDTO countryDTO2 = new CountryDTO("China", 22000.0, 600);
		CountryDTO countryDTO3 = new CountryDTO("Japan", 18000.0, 550);
		CountryDTO countryDTO4 = new CountryDTO("Germany", 16000.0, 520);
		CountryDTO countryDTO5 = new CountryDTO("United Kingdom", 15000.0, 510);
		CountryDTO countryDTO6 = new CountryDTO("France", 14000.0, 490);
		CountryDTO countryDTO7 = new CountryDTO("Italy", 13000.0, 480);
		CountryDTO countryDTO8 = new CountryDTO("Brazil", 12000.0, 470);
		CountryDTO countryDTO9 = new CountryDTO("Canada", 11000.0, 460);

		Capital capital=new Capital("delhi", "draupadi murmu", 200);
		Capital capital1 = new Capital("Washington, D.C.", "Joe Biden", 700);
		Capital capital2 = new Capital("Beijing", "Xi Jinping", 600);
		Capital capital3 = new Capital("Tokyo", "Yoshihide Suga", 550);
		Capital capital4 = new Capital("Berlin", "Angela Merkel", 520);
		Capital capital5 = new Capital("London", "Boris Johnson", 510);
		Capital capital6 = new Capital("Paris", "Emmanuel Macron", 490);
		Capital capital7 = new Capital("Rome", "Mario Draghi", 480);
		Capital capital8 = new Capital("Brasília", "Jair Bolsonaro", 470);
		Capital capital9 = new Capital("Ottawa", "Justin Trudeau", 460);

		                                  
		map.put(countryDTO, capital);
		map.put(countryDTO1, capital1);
		map.put(countryDTO2, capital2);
		map.put(countryDTO3, capital3);
		map.put(countryDTO4, capital4);
		map.put(countryDTO5, capital5);
		map.put(countryDTO6, capital6);
		map.put(countryDTO7, capital7);
		map.put(countryDTO8, capital8);
		map.put(countryDTO9, capital9);
		
		
		CountryDTO countryDTO10 = new CountryDTO("France", 10000.0, 450);
		Capital capital10 = new Capital("Canberra", "Scott Morrison", 450);
		
		map.put(countryDTO10, capital10);
		
		map.forEach((k,v)->System.out.println(k+ ":" +v));


	}

}
