package com.tmf.course.hibernataebackend.hibernate_course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "hibernate Started" );
        Configuration cfg=new Configuration();
        cfg.configure("hiber.cnf.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session so=sf.openSession();
        Course course=new Course(108,"JAVA",4,16000);
        Transaction tx= so.beginTransaction();
        so.save(course);
        tx.commit();
        so.close();
        System.out.print("inserted data");
    }
}
