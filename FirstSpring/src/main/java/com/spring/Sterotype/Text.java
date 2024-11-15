package com.spring.Sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Sterotype/Stereotype.xml");
        Shop obj = context.getBean("shop", Shop.class);
        System.out.println(obj);
	}
}
