package com.bookbox.randomizer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class BookRandomizerDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	public Book getBookFromDB(int bookId) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Book book=  (Book)session.get(Book.class, new Integer(bookId));
		session.getTransaction().commit();
		return book;
	}
  
}
