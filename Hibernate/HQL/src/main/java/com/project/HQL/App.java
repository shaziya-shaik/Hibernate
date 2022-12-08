package com.project.HQL;

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
    	 Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);//class
         
         SessionFactory sf=con.buildSessionFactory();//interface
         
         Session session=sf.openSession();//interface//open session give you object of session
      	
         
         Transaction tx=session.beginTransaction();//provide acid properties
        /* Random r=new Random();
         
         for(int i=1;i<=50;i++) {
        	 Student s=new Student();
        	 s.setSid(i);
        	 s.setSName("name"+i);
        	 s.setSMarks(r.nextInt(100));
        	 session.save(s);
         }
         tx.commit();*/ 
         
         
         //HQL
         //Query q1=session.createQuery("from Student");
        // Query q1=session.createQuery("from Student where SMarks>50");
         
       /*  List<Student> students=q1.list();//retrive any objects
         for(Student s:students) {
        	 System.out.println(s);
         }*/
       /* // Query q1=session.createQuery("from Student where SMarks=50");
        
       //  Student student=(Student)q1.uniqueResult();
        // System.out.println(student);*/
     /*    int b=50;
       //  Query q1=session.createQuery("select Sid,SName,SMarks from Student s where s.SMarks=49");
         Query q1=session.createQuery("select Sid,SName,SMarks from Student  where SMarks=:b");
         q1.setParameter("b",b);
         Object[] student =(Object[])q1.uniqueResult();//use only for one value
         System.out.println(student[0] +":"+student[1]+":"+student[2]);
         for(Object s:student) {
        	 System.out.println(s);
        	 }
         */
 
        
         
         
         //sql
         
          
    }
}
