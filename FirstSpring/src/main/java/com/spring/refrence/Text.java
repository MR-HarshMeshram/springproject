package com.spring.refrence;

import org.sample.FirstSpring.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext Cont=new ClassPathXmlApplicationContext("com/spring/refrence/Config_refrence.xml");
        B T=(B)Cont.getBean("this_B");
        System.out.println(T.getY());
        System.out.println(T.getObj());
        System.out.println(T.getObj().getX());
        System.out.println("the sum of X ,Y is :- "+(T.getY() + T.getObj().getX()));

	}

}
