package com.xworkz.bus.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.xworkz.bus.dao.BusDAO;
import com.xworkz.bus.dao.BusDAOImpl;
import com.xworkz.bus.entity.BusEntity;

public class ServiceTester {

	public static void main(String[] args) {
		
		
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BusDAOImpl impl = appcontext.getBean(BusDAOImpl.class);
		BusEntity busEntity = new BusEntity();
		busEntity.setBusId(3);
		busEntity.setBusName("Durga Travels");
		busEntity.setBusColour("Black");
		busEntity.setBusSeats(62);
		busEntity.setBusWheels(18);
		busEntity.setBusType("Ac");
		System.out.println(busEntity);
		impl.saveBus(busEntity);
		System.out.println("Saved Successfully");
	
//		BusEntity buus = new BusEntity(1,"Sugama","Black",18,50,"sleeper");
		BusService service = new BusServiceImpl();
		boolean outcome = service.validateBusEntity(busEntity);
		System.out.println(outcome);
		if(outcome) {
			BusDAO dao = new BusDAOImpl();
			dao.saveBus(busEntity); 
			System.out.println("Saved Successfully");
			}
			else {
			System.out.println("Bus is not valid...............try again");
			}
		}
	}

