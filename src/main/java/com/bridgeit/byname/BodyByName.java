package com.bridgeit.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BodyByName {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		HumanByName humanByName = applicationContext.getBean("humanByName", HumanByName.class);
		humanByName.pumping();
	}
}