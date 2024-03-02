package com.xworkz.bookdtorunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.dto.BookDTO;

public class BookRunner {
	
	public static void main(String[] args) {
		
	 BookDTO bookDTO=new BookDTO(LocalDate.of(2021, 5, 23), 2000, "Anil", 2);
	 BookDTO bookDTO2=new BookDTO(LocalDate.of(2012, 3, 21), 3000, "Madhu", 5);
	 BookDTO bookDTO3=new BookDTO(LocalDate.of(2011, 12, 21), 1500, "Kiran", 6);
	 BookDTO bookDTO4=new BookDTO(LocalDate.of(2000, 1, 22), 5550, "Nihtin", 1);
	 BookDTO bookDTO5=new BookDTO(LocalDate.of(2022, 5, 1), 7890, "Hitesh", 4);
	 BookDTO bookDTO6=new BookDTO(LocalDate.of(2008, 6, 20), 8900, "Shambu", 10);
	 
	 List<BookDTO> list=new ArrayList<BookDTO>();
	 list.add(bookDTO);
	 list.add(bookDTO2);
	 list.add(bookDTO3);
	 list.add(bookDTO4);
	 list.add(bookDTO5);
	 list.add(bookDTO6);
	 
	 list.forEach(r-> System.out.println(r));

     System.out.println("The Year Range Between 2002 to 2005");
     list.stream().filter(l->l.getDate().isAfter(LocalDate.of(2000, 1, 22))).forEach(r-> System.out.println(r));

     System.out.println("Total number of books");
     System.out.println(list.stream().filter(l->l.getAuthor()=="Life Story").count());

     System.out.println("Highest Rating books");
     list.stream().filter(l->l.getRating()>=1 && l.getRating()<=6).forEach(r-> System.out.println(r));


     System.out.println("Total Price Of All Books");
      int total=0;
      Iterator<BookDTO> iterator=list.iterator();
      while(iterator.hasNext()) {
    	 total=     iterator.next().getPrice();
    	      total+=total;
      }
      System.out.println("total price os all books is :"+total);
	}

}
