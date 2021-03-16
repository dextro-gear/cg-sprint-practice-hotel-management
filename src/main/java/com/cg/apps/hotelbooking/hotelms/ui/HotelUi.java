package com.cg.apps.hotelbooking.hotelms.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.apps.hotelbooking.hotelms.entity.Hotel;
import com.cg.apps.hotelbooking.hotelms.service.IHotelService;
import com.cg.apps.hotelbooking.roomms.entities.Room;
import com.cg.apps.hotelbooking.roomms.services.IRoomService;

@Component
public class HotelUi {

	@Autowired
	IHotelService hotelservice;
	
	@Autowired
	IRoomService roomservice;

	public void start() {
		System.out.println("******Displaying all the Hotels*******");
		Hotel Hotel1=hotelservice.addHotel("Taj Hotel", "Mumbai",null);
		Hotel Hotel2=hotelservice.addHotel("JW Marriot ","Delhi",null);
		
		displayHotel(Hotel1);
		displayHotel(Hotel2);
		
		System.out.println("*****Displaying hotel by id*****");
		long fetchedHotelId=Hotel1.getHotelId();
		Hotel fetchedhotel=hotelservice.findbyId(fetchedHotelId);
		displayHotel(fetchedhotel);
		
		
		Room room1=roomservice.addRoom(Hotel1.getHotelId(), 1, 101, 2000);
		Room room2=roomservice.addRoom(Hotel2.getHotelId(), 1, 101, 3000);
		Room room3=roomservice.addRoom(Hotel1.getHotelId(), 2, 201, 4000);
		Room room4=roomservice.addRoom(Hotel2.getHotelId(), 2, 201, 5000);
		
		long fetchedRoomId=room1.getRoomID();
		
		System.out.println("****Room by Id*****");
		System.out.println(roomservice.findByID(fetchedRoomId));
		

	}

	public void displayHotel(Hotel hotel) {
		System.out.println("Hotel id :-"+hotel.getHotelId()+" Hotel Name :-"+hotel.getHotelName()+" Hotel Address :-"+hotel.getAddress());
	}



}
