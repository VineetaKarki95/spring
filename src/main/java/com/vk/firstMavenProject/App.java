package com.vk.firstMavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Car car = (Car)applicationContext.getBean("car");
        car.drive();
    	/*Tyre tyre = (Tyre) applicationContext.getBean("tyre");
    	System.out.println(tyre.toString());*/
    }
}
