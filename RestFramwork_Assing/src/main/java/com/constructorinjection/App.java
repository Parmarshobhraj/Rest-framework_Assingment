package com.constructorinjection;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("com/constructorinjection/config.xml");
		
		User u1 = (User)con.getBean("u1");
		System.out.println(u1);
		
		User u2 = (User) con.getBean("u2");
		System.out.println(u2);
	}

}
