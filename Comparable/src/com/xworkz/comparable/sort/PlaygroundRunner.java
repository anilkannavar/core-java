package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.PlaygroundDTO;

public class PlaygroundRunner {
	
	public static void main(String[] args) {
		
		PlaygroundDTO playgroundDTO=new PlaygroundDTO("chinnaswamy", "Bnaglore", 1000, 28);
		PlaygroundDTO playgroundDTO1=new PlaygroundDTO("eden garden", "mumbai", 1890, 31);
		PlaygroundDTO playgroundDTO2=new PlaygroundDTO("kalinga stadium", "delhi", 540, 21);
		PlaygroundDTO playgroundDTO3=new PlaygroundDTO("gachibwli", "hyderabad", 2670, 87);
		PlaygroundDTO playgroundDTO4=new PlaygroundDTO("kochin", "kochi", 1340, 38);
		
		List<PlaygroundDTO> list=new ArrayList<PlaygroundDTO>();
		list.add(playgroundDTO);
		list.add(playgroundDTO2);
		list.add(playgroundDTO4);
		list.add(playgroundDTO3);
		list.add(playgroundDTO1);
		
		System.out.println("after sorting in ascending order....");
		Collections.sort(list, (p1,p2)->Double.compare(p1.getAreaInKms(), p2.getAreaInKms()));
		list.forEach(ref->System.out.println(ref));
		
		System.out.println("after sorting in decending order....");
        Collections.sort(list, (p1,p2)->Double.compare(p2.getAreaInKms(), p1.getAreaInKms()));
        list.forEach(ref->System.out.println(ref));

		

	}

}
