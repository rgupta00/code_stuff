package com.assignment.day2.bookstore;

public class SomeConfusionOnArray {
	
	public static void main(String[] args) {
		//array of object
		Book[] books=new Book[3];// how many books are there in array =0;
		books[0]=new Book("rich dad poor dad", "RK", "1322", 7);
		books[1]=new Book("pointer in c", "YK", "13402", 12);
		books[2]=new Book("atomic habbit", "foo", "131122", 4);
		
		for(Book book: books) {
			System.out.println(book.getBookTitle());
		}
		
	}

}
