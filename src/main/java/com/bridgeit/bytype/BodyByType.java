package com.bridgeit.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BodyByType {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		HumanByType humanByType = applicationContext.getBean("humanByType", HumanByType.class);
		humanByType.pumping();
	}
}