package com.cg.apps.hotelbooking.hotelms.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.apps.hotelbooking.hotelms.entity.Hotel;
import com.cg.apps.hotelbooking.hotelms.service.IHotelService;

@Component
public class HotelUi {

	@Autowired
	IHotelService hotelservice;

	public void start() {
		System.out.println("******Displaying all the Hotels*******");
		Hotel Hotel1=hotelservice.addHotel("Taj Hotel", "Mumbai");
		Hotel Hotel2=hotelservice.addHotel("JW Marriot ","Delhi");
		Hotel Hotel3=hotelservice.addHotel("Radisson Blue", "Agra");
		displayHotel(Hotel1);
		displayHotel(Hotel2);
		displayHotel(Hotel3);

		System.out.println("*****Displaying hotel by id*****");
		long fetchedHotelId=Hotel1.getHotelId();
		Hotel fetchedhotel=hotelservice.findbyId(fetchedHotelId);
		displayHotel(fetchedhotel);

	}

	public void displayHotel(Hotel hotel) {
		System.out.println("Hotel id :-"+hotel.getHotelId()+" Hotel Name :-"+hotel.getHotelName()+" Hotel Address :-"+hotel.getAddress());
	}



}
