package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTester {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        
        Person person = (Person) context.getBean("person");
        person.getCarInfo();
        //System.out.println(obj.getMessage());

	}

}
