package com.spring.collection;

import org.sample.FirstSpring.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Hello World!" );
        ApplicationContext Cont=new ClassPathXmlApplicationContext("com/spring/collection/Collection_config.xml");
       Employee Emp= (Employee)Cont.getBean("Sahile");
       System.out.println(Emp.getName());
       System.out.println(Emp.getPhones());
       System.out.println(Emp.getAddress());
       System.out.println(Emp.getLanguages());
        

	}

}
