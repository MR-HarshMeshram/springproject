package com.spring.autowring.Annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Textfile {

	public class Test {
		public static void main(String args[]){
			ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowring/Configautowring.xml");
	        Students obj=(Students)context.getBean("rohan");
	        System.out.println(obj);
		}

	}


}
