package com.han.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.han.domain.User;
import com.han.service.LoginService;

public class Client {
	 public static void main(String[] args) throws Exception {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-penngo-consumer.xml"});
	        context.start();
	 
	        LoginService loginService = (LoginService)context.getBean("loginService"); 
	        User user = loginService.login("handx", "123");
	 
	        System.out.println( user.getQq() + " " + user.getName()); 
	    }
}
