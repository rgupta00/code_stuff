package com.assignment.day2.bookstore;

public class Book {
	private String bookTitle;
	private String author;
	private String isbn;
	private int numOfCopies;
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNumOfCopies() {
		return numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	public Book(String bookTitle, String author, String isbn, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.isbn = isbn;
		this.numOfCopies = numOfCopies;
	}
	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", author=" + author + ", isbn=" + isbn + ", numOfCopies=" + numOfCopies
				+ "]";
	}
	
	
	
}
