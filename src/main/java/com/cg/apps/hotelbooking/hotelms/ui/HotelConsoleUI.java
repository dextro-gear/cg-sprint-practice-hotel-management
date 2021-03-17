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

	public void start() {
		System.out.println("\n******Displaying all the Hotels*******");
		Hotel Hotel1=hotelservice.addHotel("Taj Hotel", "Mumbai",null);
		Hotel Hotel2=hotelservice.addHotel("JW Marriot ","Delhi",null);
		
		displayHotel(Hotel1);
		displayHotel(Hotel2);
		
		System.out.println("\n*****Displaying hotel by id*****");
		long fetchedHotelId=Hotel1.getHotelId();
		Hotel fetchedhotel=hotelservice.findById(fetchedHotelId);
		displayHotel(fetchedhotel);


	}

	public void displayHotel(Hotel hotel) {
		System.out.println("Hotel id :-"+hotel.getHotelId()+" Hotel Name :-"+hotel.getHotelName()+" Hotel Address :-"+hotel.getAddress());
	}



}
