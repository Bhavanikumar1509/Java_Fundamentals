package com.beans2;

import java.util.HashMap;

public class LibraryHash {

	private HashMap<String, Book>hm;

	public LibraryHash() {
	}

	public HashMap<String, Book> getHm() {
		return hm;
	}

	public void setHm(HashMap<String, Book> hm) {
		this.hm = hm;
	}
	public void displayBooks() {
		hm.forEach ((key,value)->{
			System.out.println("key is:"+key+"\tvalue is :"+value);
		});
			
		}
	}
	
