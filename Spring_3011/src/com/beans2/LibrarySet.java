package com.beans2;
import java.util.*;
public class LibrarySet {
	private Set<Book>books;

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public void displayBook() {
		for (Book b:books) {
			System.out.println(b);
		}
	}
	

}
