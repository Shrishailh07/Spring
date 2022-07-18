package com.xworkz.bus.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bus.entity.BusEntity;

@Component
public class BusDAOImpl implements BusDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	Session session=null;

	public BusDAOImpl() {
    System.out.println("BusDAO Created");
	}

	public BusDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		System.out.println("sessionFactory is created");
	}

	@Override
	public void saveBus(BusEntity bus) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(bus);
			transaction.commit();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(session!=null) {
				session.close();
				System.out.println("session is closed");
			}
			else {
				System.out.println("session is not closed");
			}
		}
		
	}
 }

     
	
	
	


