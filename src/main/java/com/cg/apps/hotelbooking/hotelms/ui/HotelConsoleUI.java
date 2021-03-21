package com.cg.apps.hotelbooking.hotelms.ui;

import com.cg.apps.hotelbooking.hotelms.entity.Hotel;
import com.cg.apps.hotelbooking.hotelms.service.HotelServiceImpl;
import com.cg.apps.hotelbooking.roomms.entities.Room;
import com.cg.apps.hotelbooking.roomms.services.RoomServiceImpl;

import org.hibernate.hql.internal.ast.tree.DisplayableNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelConsoleUI {

	@Autowired
	HotelServiceImpl hotelservice;
	
	@Autowired
	RoomServiceImpl roomService;

	public void start() {
		System.out.println("\nHOTELS\n==============================");
		
		Hotel hotel1=hotelservice.addHotel("Taj Hotel","Mumbai");
		Hotel hotel2=hotelservice.addHotel("JW Marriott","Delhi");
		Hotel hotel3=hotelservice.addHotel("Trident Bandra Kurla","Mumbai");
		Hotel hotel4=hotelservice.addHotel("Mannat International","Paharganj");
		
		
		Room room1 = roomService.addRoom(hotel1.getHotelId(),1, 12, 2000);
		Room room2 = roomService.addRoom(hotel1.getHotelId(),1, 13, 1000);
		Room room3 = roomService.addRoom(hotel1.getHotelId(),1, 14, 2500);
		Room room4 = roomService.addRoom(hotel1.getHotelId(), 1, 15, 3000);
		Room room5= roomService.addRoom(hotel1.getHotelId(), 1, 16, 2450);
	       display(room1);
		

	
	}

	public	void display(Room room)  {
		System.out.println(room.getHotel().getHotelName()+" " +room.getRoomID()+" "+room.getFloorNumber()+ " "+room.getCost());
		
	}

}
