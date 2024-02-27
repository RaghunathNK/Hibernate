package com.ty.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main(String[] args) 
	{
		Song song = new Song();
		song.setSongname("khushiyali");
		song.setArtist("rajesh");

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Song.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session1 = sf.openSession();
		Transaction transaction=session1.beginTransaction();
		
		session1.save(song);
        transaction.commit();
	}
}
