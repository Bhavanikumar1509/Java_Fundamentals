package com.beans2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRun {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("books.xml");
		System.out.println("_____List_______");
		LibraryList l1=(LibraryList)context.getBean("libraryList");
		l1.displayBooks();
		System.out.println("_____________Set________");
		LibrarySet l2=(LibrarySet)context.getBean("librarySet");
		l2.displayBook();
		
		System.out.println("_____hashMap___");
		LibraryHash l3=(LibraryHash)context.getBean("libraryMap");
		l3.displayBooks();
		System.out.println("_____hashMap2___");
		LibraryHash2 l4=(LibraryHash2)context.getBean("libraryMap2");
		l4.displayBooks();
		
	}

}
