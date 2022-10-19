package com.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Question que = (Question) context.getBean("Question");
		Question queue = (Question) context.getBean("Question");
		Question aue = (Question) context.getBean("Question");
		que.displayList();
		queue.displaySet();
		aue.displayMap();
	}

}
