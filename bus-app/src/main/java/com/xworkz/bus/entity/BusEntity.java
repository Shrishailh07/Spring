package com.xworkz.bus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.servlet.HttpServletBean;


@Entity
@Table(name="Bus")
public class BusEntity {

@Id
@Column(name="busId")
private int busId;

@Column(name="busName")	
private String busName;

@Column(name="busColour")
private String busColour;

@Column(name="busWheels")
private int busWheels;

@Column(name="busSeats")
private int busSeats;

@Column(name="busType")
private String busType;


public BusEntity() {
	super();
}

public int getBusId() {
	return busId;
}

public void setBusId(int busId) {
	this.busId = busId;
}

public String getBusName() {
	return busName;
}

public void setBusName(String busName) {
	this.busName = busName;
}

public String getBusColour() {
	return busColour;
}

public void setBusColour(String busColour) {
	this.busColour = busColour;
}

public int getBusWheels() {
	return busWheels;
}

public void setBusWheels(int busWheels) {
	this.busWheels = busWheels;
}

public int getBusSeats() {
	return busSeats;
}

public void setBusSeats(int busSeats) {
	this.busSeats = busSeats;
}

public String getBusType() {
	return busType;
}

public void setBusType(String busType) {
	this.busType = busType;
}

public BusEntity(int busId, String busName, String busColour, int busWheels, int busSeats, String busType) {
	super();
	this.busId = busId;
	this.busName = busName;
	this.busColour = busColour;
	this.busWheels = busWheels;
	this.busSeats = busSeats;
	this.busType = busType;
}

@Override
public String toString() {
	return "BusEntity [busId=" + busId + ", busName=" + busName + ", busColour=" + busColour + ", busWheels=" + busWheels
			+ ", busSeats=" + busSeats + ", busType=" + busType + "]";
}





}
