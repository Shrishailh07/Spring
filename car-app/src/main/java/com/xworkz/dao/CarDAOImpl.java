package com.xworkz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.entity.CarEntity;

@Component
public class CarDAOImpl implements CardDAO{

	
	public CarDAOImpl() {
System.out.println("CarDAOImpl created");
	}

	@Autowired
	private SessionFactory sessionFactory;
	Session session = null;
	
public boolean saveCar(CarEntity carEntity) {

	try {
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(carEntity);
		transaction.commit();
	} catch (Exception e) {
		
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
	return false;
	
}
}

