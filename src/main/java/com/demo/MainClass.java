package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	
	public static void main(String[] args) {
		
		Configuration  cfg = new Configuration ();
		cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	
	Adhar ad= new Adhar();
	ad.setAdharNo("725054139265");
	ad.setBirthDate("27-09-1997");
	
	Person pr = new Person();
	pr.setAdhar(ad);
	pr.setCity("Pune");
	pr.setFirstName("Samadhan");
	pr.setLastName("Metkari");
		
	ss.save(pr);
	tr.commit();
	ss.close();
	
	System.out.println("Inserted Succesfully");
	
	
	
		
	}

}
