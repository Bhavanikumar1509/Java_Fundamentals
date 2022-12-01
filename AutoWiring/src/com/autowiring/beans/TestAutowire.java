package com.autowiring.beans;
import com.autowiring.beans.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean emp1=(EmployeeBean)context.getBean("employee1");
		System.out.println(emp1);
		EmployeeBean emp2=(EmployeeBean)context.getBean("employee2");
		System.out.println(emp2);
		
		

}
}
