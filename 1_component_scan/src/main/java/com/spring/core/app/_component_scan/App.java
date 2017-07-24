package com.spring.core.app._component_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.service.UserService;
import com.spring.core.serviceimpl.UserServiceImpl;

/**
 * SPring :- Component Scan Example Test
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
       		     ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    		     UserService userService = (UserService)context.getBean(UserServiceImpl.class);
    		    //Or   UserService userService = (UserService)context.getBean("userService");
    		 
    		     System.out.println(userService.getUser());
    }
}
