package com.assignment.day2.q3;

public class Book {
	private String bookTitle;
	private Author author;
	private double price;
	private int quantity=0;
	public Book(String bookTitle, Author author, double price) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public Book(String bookTitle, Author author, double price, int quantity) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
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
		return "Book [bookTitle=" + bookTitle + ", author=" + author + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
}
