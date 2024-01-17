package com.xworkz.comparable;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class CardBoardDTO implements Serializable,Comparable<CardBoardDTO>{
	
	private String name;
	
	private double quantity;
	
	private int cost;
	
	private String address;

	@Override
	public int compareTo(CardBoardDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
