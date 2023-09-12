package com.tmf.course.springbackend.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context;
        context=new AnnotationConfigApplicationContext(SpringConfiguation.class);
        Customer c=context.getBean(Customer.class);
        System.out.println(c);
    }
}
