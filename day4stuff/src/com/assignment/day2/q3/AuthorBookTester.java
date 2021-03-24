package com.assignment.day2.q3;

public class AuthorBookTester {

	public static void main(String[] args) {
		Author author=new Author("Sushant", "s@gmail.com", Gender.MALE);
		
		Book book=new Book("java is fun", author, 500, 30);
		
		System.out.println(book);
	}
}
