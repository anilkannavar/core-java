package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.AlarmDTO;
import com.xworkz.comparable.CardBoardDTO;

public class CardBoardRunner {
	
	public static void main(String[] args) {
		
		CardBoardDTO cardBoardDto=new CardBoardDTO("wood", 209, 785, "INDIA");
		CardBoardDTO cardBoardDto1=new CardBoardDTO("polythin", 340, 908, "AUSTRALIA");
		CardBoardDTO cardBoardDto2=new CardBoardDTO("hard plastic", 010, 325, "BANGLADESH");
		CardBoardDTO cardBoardDto3=new CardBoardDTO("fiber", 115, 309, "SRILANKA");
		CardBoardDTO cardBoardDto4=new CardBoardDTO("metal", 30, 2000, "JAPAN");
		List<CardBoardDTO> list=new ArrayList<>();
		list.add(cardBoardDto);
		list.add(cardBoardDto1);
		list.add(cardBoardDto2);
		list.add(cardBoardDto3);
		list.add(cardBoardDto4);

		Collections.sort(list);
		for(CardBoardDTO ref:list) {
			System.out.println(ref);
	}
		Collections.sort(list,(o1,o2)->o2.getAddress().compareTo(o1.getAddress()));
		System.out.println("after sorting address in descending order");
		for(CardBoardDTO ref:list) {
			System.out.println(ref);


}
}
}
