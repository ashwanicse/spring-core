package com.spring.core._spring_value_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.config.ApplicationConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
     
     ApplicationConfig ac = ctx.getBean(ApplicationConfig.class);
     
     System.out.println(ac);
    }
}
