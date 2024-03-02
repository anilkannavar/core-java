package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;



public class BookDTO implements Serializable{

	private LocalDate date;
	
	private int price;
	
	private String author;
	
	private int rating;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "BookDTO [date=" + date + ", price=" + price + ", author=" + author + ", rating=" + rating + "]";
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public BookDTO(LocalDate date, int price, String author, int rating) {
		super();
		this.date = date;
		this.price = price;
		this.author = author;
		this.rating = rating;
	} 
	
}
