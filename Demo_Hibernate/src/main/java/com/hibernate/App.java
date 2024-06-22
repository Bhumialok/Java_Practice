package com.hibernate;

import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "First project on Hibernate" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Employee emp=new Employee();
        emp.setEid(111);
        emp.setName("Alok");
        emp.setCity("Gaya");
        emp.setOpen(true);
        emp.setX(1);
        
        try (FileInputStream is = new FileInputStream("src/main/java/instaheart-png-design-5690394.webp")) {
			byte[] img=new byte[is.available()];
			is.read();
			emp.setImage(img);
		}
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(emp);
        tx.commit();
        session.close();
        factory.close();
        System.out.println("image uploaded");
        
        }
}
