package com.spring.autowring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowring/Configautowring.xml");
        Employee emp=(Employee)context.getBean("emp1");
        System.out.println(emp);
	}

}
