package com.spring.core._working_with_properties_file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.dao.UserDAO;
import com.spring.core.daoimpl.UserDAOImpl;
import com.spring.core.dto.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        
        User user = context.getBean(User.class);
        
        UserDAO userDAO = context.getBean(UserDAOImpl.class);
        
        int rowAffacted = userDAO.save(user);
        
        System.out.println("user successfully saved in database, row affacted : "+rowAffacted);
    }
}
