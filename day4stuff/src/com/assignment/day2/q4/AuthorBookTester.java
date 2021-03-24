package com.assignment.day2.q4;

public class AuthorBookTester {

	public static void main(String[] args) {
		Author author1=new Author("Sushant", "s@gmail.com", Gender.MALE);
		Author author2=new Author("syed", "syed@gmail.com", Gender.MALE);
		
		Author[]authors= {author1, author2};
		
		
		Book book=new Book("java is fun", authors, 500, 30);
		
		System.out.println(book);
	}
}
