package com.project.MappingRelationTheory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Laptop laptop=new Laptop();
    	laptop.setId(79);
    	laptop.setLname("Apple");
    	
    	
    	Student student=new Student();
    	student.setRoll_no(5);
    	student.setName("khan");
    	student.setMarks(89);
    	//student.setLaptop(laptop);
    	//student.getLaptop().add(laptop);
    //	laptop.setStudent(student);
    	laptop.getStudent().add(student);
    	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(laptop);
    	session.save(student);
    	tx.commit();
    }
}
