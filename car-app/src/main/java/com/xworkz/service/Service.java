package com.xworkz.service;

import org.springframework.web.bind.annotation.RequestParam;

public interface Service {

	boolean validateAllDetails( String name,String colour, int speed, int seats, int price);
	
    boolean saveAll( String name, String colour, int speed, int seats, int price);
}
