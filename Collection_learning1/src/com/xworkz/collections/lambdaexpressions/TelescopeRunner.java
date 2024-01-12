package com.xworkz.collections.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TelescopeRunner {
	
	

	public static void main(String[] args) {
		
		TelescopeDto telescopeDto=new TelescopeDto("gellilo", 23000, 155, "israel");
		TelescopeDto telescopeDto1=new TelescopeDto("zanzibar", 63000, 955, "denmark");
		TelescopeDto telescopeDto2=new TelescopeDto("haketown", 83000, 155, "india");
		TelescopeDto telescopeDto3=new TelescopeDto("baugman", 13000, 655, "australia");
		TelescopeDto telescopeDto4=new TelescopeDto("telescope", 73000, 455, "japan");

		List<TelescopeDto> list=new ArrayList<TelescopeDto>();
		list.add(telescopeDto);
		list.add(telescopeDto1);
		list.add(telescopeDto2);
		list.add(telescopeDto3);
		list.add(telescopeDto4);
		
		for(TelescopeDto ref:list) {
			System.out.println(ref);
		}
		System.out.println("***************************************");
		Comparator<TelescopeDto> nameAsc=(p1,p2)->{
			return p1.getName().compareTo(p2.getName());
		};
		System.out.println("after sorting name in asc");
		Collections.sort(list,nameAsc);
		for(TelescopeDto name:list) {
			System.out.println(name);
		}
		
		System.out.println("*********************************************");
			Comparator<TelescopeDto> nameDec=(p1,p2)->{
				return p2.getName().compareTo(p1.getName());
			};
			System.out.println("after sorting name in Desc");
			Collections.sort(list,nameDec);
			for(TelescopeDto name:list) {
				System.out.println(name);
			}
			
			System.out.println("*********************************************");
			System.out.println("after sorting cost in asc");
			Comparator<TelescopeDto> costAsc=(c1,c2)->{
				return Integer.compare(c1.getCost(),c2.getCost());
			};
			Collections.sort(list,costAsc);
			for(TelescopeDto cost:list) {
				System.out.println(cost);
			}
			
			System.out.println("*********************************************");
			System.out.println("after sorting cost in desc");
			Comparator<TelescopeDto> costDec=(c1,c2)->{
				return Integer.compare(c2.getCost(),c1.getCost());
			};
			Collections.sort(list,costDec);
			for(TelescopeDto connect:list) {
				System.out.println(connect);
			}
			
			System.out.println("*********************************************");
			System.out.println("after sorting weight in asc");
			Comparator<TelescopeDto> weightAsc=(s1,s2)->{
				return Double.compare(s1.getWeight(),s2.getWeight());
			};
			Collections.sort(list,weightAsc);
			for(TelescopeDto weight:list) {
				System.out.println(weight);
			}
			
			System.out.println("*********************************************");
			System.out.println("after sorting weight in desc");
			Comparator<TelescopeDto> weightDesc=(s1,s2)->{
				return Double.compare(s2.getWeight(),s1.getWeight());
			};
			Collections.sort(list,weightDesc);
			for(TelescopeDto manufacture:list) {
				System.out.println(manufacture);
			}
			
			
			System.out.println("*********************************************");
			System.out.println("aafter sorting country in asc");
			Collections.sort(list,(l1,l2)->(l1.getCountry().compareTo(l2.getCountry())));
			for(TelescopeDto country:list) {
				System.out.println(country);
			}
			
			System.out.println("***********************************************");
			
			System.out.println("aafter sorting country in Desc");
			Collections.sort(list,(l1,l2)->(l2.getCountry().compareTo(l1.getCountry())));
			for(TelescopeDto type:list) {
				System.out.println(type);
			}
	}

}
