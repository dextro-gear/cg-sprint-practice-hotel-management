package com.cg.apps.hotelbooking.hotelms.entity;

import com.cg.apps.hotelbooking.roomms.entities.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;
@Entity
public class Hotel {
	@GeneratedValue
	@Id
	private Long hotelId;
	private String hotelName;
	private String address;
	
	@OneToMany
	private List<Room>roomsList;
	
	public List<Room> getRoomsList() {
		return roomsList;
	}

	public void setRoomsList(List<Room> roomsList) {
		this.roomsList = roomsList;
	}

	public Hotel(String hotelName2, String adderss, List<Room> rooms) {
		
	}

	public Hotel(String hotelName, String address) {
	
		this.hotelName = hotelName;
		this.address = address;
	}
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
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
