package com.beans2;
import java.util.*;
public class LibraryList {
	private ArrayList<Book>books;
	public LibraryList() {
		
	}
	public ArrayList<Book> getBooks(){
		return books;
	}
	public void setBooks(ArrayList<Book>books) {
		this.books=books;
	}
	public void displayBooks() {
		for(Book b:books) {
			System.out.println(b);
			
		}
	}
	
	

}
