package com.hjp.ehcache.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserService.class);
        
        User user1 = new User(2, "Mert", "5552345060", 34);
        User userFetch1 = userService.getUser(user1);   
        System.out.println(userFetch1);
        User userFetch2 = userService.getUser(user1);
        System.out.println(userFetch2);


        User user2=new User(1,"Huang Jianping","343567888",37);
        User userFetch3=userService.getUser(user2);
        System.out.println(userFetch3);
        User userFetch4=userService.getUser(user2);
        System.out.println(userFetch4);
        

        
        

	}

}
