package com.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestCustomer {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");		System.out.println("context  is instiated");
		Customer c1=(Customer)(con.getBean("c1"));
		System.out.println(c1);
		
		
	}

}
