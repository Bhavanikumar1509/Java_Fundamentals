package com.beans2;

import java.util.Objects;

public class Book {
	private String isbn;
	private String bookname;
	private int price;
	public Book() {
		
	}
	public Book(String isbn, String bookname, int price) {
		super();
		this.isbn = isbn;
		this.bookname = bookname;
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [isbn=" + isbn + ", bookname=" + bookname + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookname, isbn, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookname, other.bookname) && Objects.equals(isbn, other.isbn) && price == other.price;
	}
	

}
