package com.cg.apps.hotelbooking.hotelms.entity;

import com.cg.apps.hotelbooking.roomms.entities.Room;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class Hotel {
	@GeneratedValue
	@Id
	private Long hotelId;
	private String hotelName;
	private String address;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Room> roomsList;
	

	public Hotel(String hotelName, String address, List<Room> roomsList) {
		this.hotelName = hotelName;
		this.address = address;
		this.roomsList = roomsList;
	}

	public Hotel() { }

	public Hotel(String hotelName, String address) {

		this.hotelName = hotelName;
		this.address = address;
	}

	public List<Room> getRoomsList() {
		return roomsList;
	}

	public void setRoomsList(List<Room> roomsList) {
		this.roomsList = roomsList;
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

	public void addToRooms(Room room){
		this.roomsList.add(room);
	}

	public void addToRooms(Collection<Room> rooms){
		this.roomsList.addAll(rooms);
	}

	@Override
	public String toString() {
		return "Hotel{" +
				"hotelId=" + hotelId +
				", hotelName='" + hotelName + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
