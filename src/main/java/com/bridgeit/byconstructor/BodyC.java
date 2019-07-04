package com.bridgeit.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BodyC {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		HumanC humanC = applicationContext.getBean("humanC", HumanC.class);
		humanC.pumping();
	}
}

