package com.project.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s=new Student();
    	s.setSid(51);
    	s.setSMarks(98);
    	s.setSName("Name51");
    	
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
    	EntityManager em=emf.createEntityManager();
       // Student s1=em.find(Student.class,5);//finding a value
       // System.out.println(s1);
    	em.getTransaction().begin();
    	em.persist(s);
    	em.getTransaction().commit();
    	System.out.println(s);
    	
    }
}
