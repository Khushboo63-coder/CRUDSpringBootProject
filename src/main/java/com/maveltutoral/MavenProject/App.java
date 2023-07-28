package com.maveltutoral.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
//SessionFactory factory = new Configuration().configure().buildSessionFactory(); or 
    Configuration cfg = new Configuration();
    System.out.println("Hello World!");

    cfg.configure("hibernare.cfg.xml");

    
    SessionFactory factory = cfg.buildSessionFactory();
    System.out.println("Hello World!");

     System.out.println(factory);
  
     Student obj =  new Student(1,"Khushboo", "Delhi");
     
     Session session =factory.openSession();
     Transaction t =session.beginTransaction();
     
     session.save(obj);
     t.commit();
     session.close();
     }
}
