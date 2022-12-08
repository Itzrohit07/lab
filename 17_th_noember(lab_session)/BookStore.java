package com.book;
import java.util.ArrayList;
public class BookStore {

ArrayList<Book> bookList = new ArrayList<>(); 			
	
	
	public void addBook(Book e) {					//passing book object as argument
		bookList.add(e);					//adding new book object to bookList Collection
	}
	

	public void searchByTitle(String title) {			//passing title string as argument to search
		for (Book e: bookList) {
			if(title.contains(e.getTitle())) {		//condition
				System.out.println(e);
				break;
			}else {
				System.out.println("not found");
				break;
			}
		}
	} 
	
	
	public void searchByAuthor(String author) {			//passing author string as argument to search
		for (Book e : bookList) {
			if(author.contains(e.getAuthor())) {		//condition created 
				System.out.println(e);
				break;
			}else {
				System.out.println("not found");
				break;
			}
		}
	}
	
	 
	public void displayAll() {					//displayAll method with traverse and print all the elements of bookList collection
		
		for(Book e : bookList) {				//enhanced foreach loop
			System.out.println(e);
		}
	}
}