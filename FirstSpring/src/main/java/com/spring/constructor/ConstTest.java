package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.constructor.*;

public class ConstTest {
	public static void main(String[] args) {
		 ApplicationContext Cont=new ClassPathXmlApplicationContext("com/spring/constructor/ConfigConst.xml");
	       Users User= (Users)Cont.getBean("user");
	       System.out.println(User)	;
	       }

}
