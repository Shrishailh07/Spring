package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dao.CarDAOImpl;
import com.xworkz.entity.CarEntity;

@Component
public class ServiceImpl implements Service {


@Autowired
private CarDAOImpl carDAOImpl;

	public ServiceImpl(){
   System.out.println("ServiceImpl created");
	}
	
	@Override
	public boolean validateAllDetails(String name, String colour, int speed, int seats, int price) {
		boolean flag=false;
		if(name!=null &&! name.isEmpty() &&! name.isBlank()) {
			flag=true;
			System.out.println("Name is valid : "+name);
		   }
			else {
				flag=false;
				System.out.println("Name is not valid : "+name);
				return flag;
			}
		
		
		if(colour!=null &&! colour.isEmpty() &&! colour.isBlank()) {
			flag=true;
			System.out.println("Colour is valid : "+colour);
		    }
			else {
				flag=false;
				System.out.println("Colour is not valid : "+colour);
				return flag;
			}
		
		
		if(speed>0) {
			flag=true;
			System.out.println("Speed is valid : "+speed);
		}
		else {
			flag=false;
			System.out.println("Speed is not value : "+speed);
			return flag;
		}
		
		
		if(seats>=2) {
			flag=true;
			System.out.println("Seats are valid : "+seats);
		}
		else {
			flag=false;
			System.out.println("Seats are not valid : "+seats);
			return flag;
		}
		
		
		if(price>100000) {
			flag=true;
			System.out.println("Price is valid : "+price);
		}
		else {
			flag=false;
			System.out.println("Price is not valid : "+price);
			return flag;
		}
	    
		return flag;
	}

	@Override
	public boolean saveAll(String name, String colour, int speed, int seats, int price) {
		CarEntity carEntity = new CarEntity(name, colour, speed, seats, price);
		
		boolean carsaved=this.carDAOImpl.saveCar(carEntity);
	
		return false;
	}

}
