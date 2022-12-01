package com.beans2;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryHash2 {
	private HashMap<String, ArrayList<Book>>hm;

	
	public LibraryHash2() {
	}
	


	public HashMap<String, ArrayList<Book>> getHm() {
		return hm;
	}



	public void setHm(HashMap<String, ArrayList<Book>> hm) {
		this.hm = hm;
	}



	public void displayBooks() {
		hm.forEach ((key,value)->{
			System.out.println("key is:"+key+"\tvalue is :"+value);
		});
			
		}

}
