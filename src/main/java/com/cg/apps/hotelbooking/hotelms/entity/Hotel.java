package com.cg.apps.hotelbooking.hotelms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Hotel {
	@GeneratedValue
	@Id
	private long hotelId;
	private String hotelName;
	private String address;
	
	public Hotel() {
		
	}

	public Hotel(String hotelName, String address) {
	
		this.hotelName = hotelName;
		this.address = address;
	}
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
