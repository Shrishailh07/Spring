package com.xworkz.bus.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bus.entity.BusEntity;

public class BusTester {

	public static void main(String[] args) {
		
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BusDAOImpl impl = appcontext.getBean(BusDAOImpl.class);
		BusEntity busEntity = new BusEntity();
		busEntity.setBusId(2);
		busEntity.setBusName("SRS");
		busEntity.setBusColour("Blue");
		busEntity.setBusSeats(48);
		busEntity.setBusWheels(12);
		busEntity.setBusType("Sleeper coach");
		System.out.println(busEntity);
		System.out.println("Saved Successfully");
	}
}
