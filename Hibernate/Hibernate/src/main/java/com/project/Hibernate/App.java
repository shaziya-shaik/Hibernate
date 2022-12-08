package com.project.Hibernate;

import javax.imageio.spi.ServiceRegistry;

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
      // Demo sha=null;
    	Demo sha=new Demo();
    	Demo_Name s=new Demo_Name();
    	s.setfName("Nagoor");
    	s.setlName("patan");
    	s.setmName("Khan");
       sha.setEid(74);
       sha.seteName(s);
       sha.setColor("Red");
       
     
       Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Demo.class);//class
       
       SessionFactory sf=con.buildSessionFactory();//interface
       
       Session session=sf.openSession();//interface//open session give you object of session
    	
       
       Transaction tx=session.beginTransaction();//provide acid properties
       session.save(sha);
    //  sha=(Demo)session.get(Demo.class,74);
       tx.commit();
       System.out.println(sha);
    }
}
