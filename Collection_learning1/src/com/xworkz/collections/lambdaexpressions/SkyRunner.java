package com.xworkz.collections.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SkyRunner {
	public static void main(String[] args) {
		
		SkyWalkDto skyWalkDto=new SkyWalkDto("Dvangere", "PJ Extension", 910000, 3000);
		SkyWalkDto skyWalkDto1=new SkyWalkDto("Bnaglore", "churchstreet", 890000, 360);
		SkyWalkDto skyWalkDto2=new SkyWalkDto("zimbabwe", "washington", 894300, 930);
		SkyWalkDto skyWalkDto3=new SkyWalkDto("denmark", "kb Extension", 10080, 730);
		SkyWalkDto skyWalkDto4=new SkyWalkDto("portugese", "vishwaeswarayya road ", 50000, 310);
		
		List<SkyWalkDto> skyWalkDtoref=new ArrayList<SkyWalkDto>();
		skyWalkDtoref.add(skyWalkDto);
		skyWalkDtoref.add(skyWalkDto1);
		skyWalkDtoref.add(skyWalkDto2);
		skyWalkDtoref.add(skyWalkDto3);
		skyWalkDtoref.add(skyWalkDto4);
		
		for(SkyWalkDto ref:skyWalkDtoref) {
			System.out.println(ref);
		}
		System.out.println("***************************************");
		Comparator<SkyWalkDto> nameAsc=(p1,p2)->{
			return p1.getName().compareTo(p2.getName());
		};
		System.out.println("aafter sorting name in asc");
		Collections.sort(skyWalkDtoref,nameAsc);
		for(SkyWalkDto name:skyWalkDtoref) {
			System.out.println(name);
		}
		
		System.out.println("*********************************************");
			Comparator<SkyWalkDto> nameDec=(p1,p2)->{
				return p2.getName().compareTo(p1.getName());
			};
			System.out.println("aafter sorting name in Desc");
			Collections.sort(skyWalkDtoref,nameDec);
			for(SkyWalkDto name:skyWalkDtoref) {
				System.out.println(name);
			}
			
			System.out.println("*********************************************");
			System.out.println("after sorting location in asc");
			Comparator<SkyWalkDto> locationAsc=(c1,c2)->{
				return c1.getLocation().compareTo(c2.getLocation());
			};
			Collections.sort(skyWalkDtoref,locationAsc);
			for(SkyWalkDto location:skyWalkDtoref) {
				System.out.println(location);
			}
			
			System.out.println("*********************************************");
			System.out.println("aafter sorting location in desc");
			Comparator<SkyWalkDto> locationDec=(c1,c2)->{
				return c2.getLocation().compareTo(c1.getLocation());
			};
			Collections.sort(skyWalkDtoref,locationDec);
			for(SkyWalkDto connect:skyWalkDtoref) {
				System.out.println(connect);
			}
			
			System.out.println("*********************************************");
			System.out.println("aafter sorting manufacturedcost in asc");
			Comparator<SkyWalkDto> manufacturedAsc=(s1,s2)->{
				return Integer.compare(s1.getManufacturedCost(),s2.getManufacturedCost());
			};
			Collections.sort(skyWalkDtoref,manufacturedAsc);
			for(SkyWalkDto manufacture:skyWalkDtoref) {
				System.out.println(manufacture);
			}
			
			System.out.println("*********************************************");
			System.out.println("aafter sorting manufacturing in desc");
			Comparator<SkyWalkDto> manufacturDesc=(s1,s2)->{
				return Integer.compare(s2.getManufacturedCost(),s1.getManufacturedCost());
			};
			Collections.sort(skyWalkDtoref,manufacturDesc);
			for(SkyWalkDto manufacture:skyWalkDtoref) {
				System.out.println(manufacture);
			}
			
			Comparator<SkyWalkDto> stepsAsc=(t1,t2)->{
				return Integer.compare(t1.getSteps(),t2.getSteps());
			};
			System.out.println("*********************************************");
			System.out.println("aafter sorting type in asc");
			Collections.sort(skyWalkDtoref,stepsAsc);
			for(SkyWalkDto type:skyWalkDtoref) {
				System.out.println(type);
			}
			
			System.out.println("***********************************************");
			Comparator<SkyWalkDto> stepsDesc=(t1,t2)->{
				return Integer.compare(t2.getSteps(),t1.getSteps());
			};
			System.out.println("aafter sorting type in Desc");
			Collections.sort(skyWalkDtoref,stepsDesc);
			for(SkyWalkDto type:skyWalkDtoref) {
				System.out.println(type);
			}
			
		}
    }

