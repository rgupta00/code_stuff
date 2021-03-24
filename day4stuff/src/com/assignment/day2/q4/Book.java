package com.assignment.day2.q4;

import java.util.Arrays;

public class Book {
	private String bookTitle;
	private Author[] authors;
	private double price;
	private int quantity=0;
	
	public Book(String bookTitle, Author[] authors, double price, int quantity) {
		this.bookTitle = bookTitle;
		this.authors = authors;
		this.price = price;
		this.quantity = quantity;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		String authorsDetails = Arrays.toString(authors);
		
		return "bookTitle=" + bookTitle + ", price=" + price
				+ ", quantity=" + quantity + " and author details are : "+ authorsDetails;
	}
	
	
	
}
