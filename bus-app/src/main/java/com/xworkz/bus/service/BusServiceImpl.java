package com.xworkz.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.bus.dao.BusDAO;
import com.xworkz.bus.dao.BusDAOImpl;
import com.xworkz.bus.entity.BusEntity;

@Service()
public class BusServiceImpl implements BusService{
	
	
	
	@Autowired
	private BusDAOImpl busDAOImpl;
	
	public BusServiceImpl() {
    System.out.println("Service is created");
	}

	@Override
	public boolean validateBusEntity(BusEntity busEntity) {
		
		boolean flag=false;
		
		if (busEntity.getBusId()>0) {
			flag = true;
			System.out.println("BusId is valid "+busEntity.getBusId());
		} else {
			flag = false;
			System.out.println("BusId is not valid");
			return flag;
		}
		
		if (busEntity.getBusName()!= null && !busEntity.getBusName().isEmpty() && !busEntity.getBusName().isBlank()) {
			flag = true;
			System.out.println("Name is valid");
		} else {
			flag = false;
			System.out.println("Name is not valid");
			return flag;
		}

		if (busEntity.getBusColour() != null && !busEntity.getBusColour().isEmpty() && !busEntity.getBusColour().isBlank()) {
			flag = true;
			System.out.println("Colour is valid");
		} else {
            flag=false;
			System.out.println("Colour is not Valid");
			return flag;
		}
		if (busEntity.getBusWheels()>0) {
			flag = true;
			System.out.println("busWheels is valid");
		} else {
			flag = false;
			System.out.println("busWheels is not valid");
			return flag;
		}
		if (busEntity.getBusSeats()>0) {
			flag = true;
			System.out.println("BusSeats is valid");
		} else {
			flag = false;
			System.out.println("BusSeats is not valid");
			return flag;
		}
		if (busEntity.getBusType() != null && !busEntity.getBusType().isEmpty() && !busEntity.getBusType().isBlank()) {
			flag = true;
			System.out.println("BusType is valid");
		} else {
            flag=false;
			System.out.println("BusType is not Valid");
			return flag;
		}
		return flag;
	}
	
	public void saveBus(BusEntity bus) {
		busDAOImpl.saveBus(bus);
	}

}
