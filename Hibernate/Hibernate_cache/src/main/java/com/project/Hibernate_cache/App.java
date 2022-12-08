package com.project.Hibernate_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);//class
        
        SessionFactory sf=con.buildSessionFactory();//interface
        
        Session session=sf.openSession();//interface//open session give you object of session
     	
        
        Transaction tx=session.beginTransaction();//provide acid properties
       /* for(int i=0;i<=50;i++) {
        	Student s=new Student();
        	s.setSid(i);
        	s.setSname("name"+i);
        	session.save(s);
        }*/
        Query q1=session.createQuery("from Student where Sid=7");
        q1.setCacheable(true);
        
        Student s1=null;
         //s1=(Student)session.get(Student.class,1);
        s1=(Student)q1.uniqueResult();
        System.out.println(s1.getSid());
        System.out.println(s1.getSname());

       System.out.println(s1.getSid());
       System.out.println(s1.getSname());//first level cache
       tx.commit();
        
  Session session1=sf.openSession();//interface//open session give you object of session 
        Transaction tx1=session1.beginTransaction();
        Query q2=session1.createQuery("from Student where Sid=7");
        q2.setCacheable(true);
        Student s=null;
      //  s=(Student)session1.get(Student.class,1);
        s=(Student)q2.uniqueResult();
       System.out.println(s.getSid());
       System.out.println(s.getSname());
       tx1.commit();
       //for two sessions 2 times query executed/generated for the same Query it is over come by using second level cache
    	
}
}
