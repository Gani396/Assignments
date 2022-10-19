package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer customer = (Customer) context.getBean("customer");
		customer.printDetails();
		Adress adress = (Adress) context.getBean("adress");
		adress.add();
	}

}
