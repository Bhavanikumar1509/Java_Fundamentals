package com.beans2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleBeanDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext();
		LifeCycleBean lcb=(LifeCycleBean)context.getBean("life");
		System.out.println("Bean Loaded!!");
		
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
