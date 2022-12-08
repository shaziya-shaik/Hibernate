package com.project.Featch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
       /* Laptop laptop1=new Laptop();
        laptop1.setLid(108);
        laptop1.setLname("HP");
        
    	Employee employee1=new Employee();
    	employee1.setEid(1);
    	employee1.setEName("shaziya");
    	laptop1.setEmployee(employee1);
    	
    	 Laptop laptop2=new Laptop();
         laptop2.setLid(61);
         laptop2.setLname("Honor");
         
     	Employee employee2=new Employee();
     	employee2.setEid(2);
     	employee2.setEName("Yamini");
     	laptop2.setEmployee(employee1);
    	
     	 Laptop laptop3=new Laptop();
         laptop3.setLid(74);
         laptop3.setLname("Dell");
         
     	Employee employee3=new Employee();
     	employee3.setEid(3);
     	employee3.setEName("Nasha");
     	laptop3.setEmployee(employee2);
     	
     	Laptop laptop4=new Laptop();
        laptop4.setLid(78);
        laptop4.setLname("Acer");
        
    	Employee employee4=new Employee();
    	employee4.setEid(4);
    	employee4.setEName("Khan");
    	laptop4.setEmployee(employee4);*/
     	
     	Configuration con=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Employee.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        /*session.save(laptop1);
        session.save(employee1);
        session.save(laptop2);
        session.save(employee2);
        session.save(laptop3);
        session.save(employee3);
        session.save(laptop4);
        session.save(employee4);*/
        Employee e1=session.get(Employee.class,1);
        System.out.println(e1.getEid());
        System.out.println(e1.getEName());
       /* List<Laptop>laps=e1.getLaptop();
        for(Laptop l:laps) {
        	System.out.println(l);
        }*/
        System.out.println(e1.getLaptop());
        tx.commit();
    }
}
