package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao
{
	private static Configuration con;
	private static SessionFactory factory;
	private static Session session;
	private static Transaction t;
	
	public static void save(Student s)
	{
		con=new Configuration().configure("hibernate.cfg.xml");
		factory=con.buildSessionFactory();
		session=factory.openSession();
		t=session.beginTransaction();
		session.save(s);
		t.commit();
		session.close();
		
		
	}

}
