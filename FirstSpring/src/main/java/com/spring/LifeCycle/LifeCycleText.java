package com.spring.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleText {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/LifeCycle/ConfigLifeCycle.xml");
        
		FistTypeLifeCycle firstLifeCycle = (FistTypeLifeCycle) context.getBean("firstLC");
        System.out.println(firstLifeCycle);

        SecondTypeLifeCycle second=(SecondTypeLifeCycle) context.getBean("secodLC");
        System.out.println(second);
        
        context.registerShutdownHook(); 
	}
}