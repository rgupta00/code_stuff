package com.assignment.day2.bookstore;

public class BookStore {
	private Book[] books;
	
	public BookStore() {
		books=new Book[3];
		books[0]=new Book("rich dad poor dad", "RK", "1322", 7);
		books[1]=new Book("pointer in c", "YK", "13402", 12);
		books[2]=new Book("atomic habbit", "foo", "131122", 4);
	}
	void sell(String bookTitle, int noOfCopies) {
		boolean isFound=false;
		for(int i=0;i< books.length; i++) {
			Book temp= books[i];
			if(bookTitle.equalsIgnoreCase(temp.getBookTitle())) {
				temp.setNumOfCopies(temp.getNumOfCopies()-noOfCopies);
				books[i]=temp;
				isFound=true;
			}
		}
		if(isFound) {
			System.out.println("book was found and sold ");
		}else
			System.out.println("sorry book is not found");
	}
	void order(String isbn, int nofOfCopies) {
		
	}
	void display() {
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
}
