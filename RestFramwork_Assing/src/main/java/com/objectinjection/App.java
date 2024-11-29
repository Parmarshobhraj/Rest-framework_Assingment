package com.objectinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/objectinjection/config.xml");
		
		User u = (User) con.getBean("u");
		System.out.println(u);
		
		Address address = (Address) con.getBean("address");
		System.out.println(address);
}

}
