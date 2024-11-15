package org.sample.FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

/**
 * Class containing the "main" method
 * prints Hello world! by default - replace with your code
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        //remove the line below and replace with your code.
        System.out.println( "Hello World!" );
        ApplicationContext Cont=new ClassPathXmlApplicationContext("config.xml");
        Student ST=(Student)Cont.getBean("student");
        System.out.println(ST);
    }
}
