package com.ty.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Song.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		Song song = session.get(Song.class, 1);
		session.delete(song);
		
	}
}
