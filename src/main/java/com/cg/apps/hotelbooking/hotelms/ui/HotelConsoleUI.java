package com.cg.apps.hotelbooking.hotelms.ui;

import com.cg.apps.hotelbooking.hotelms.service.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelConsoleUI {

	@Autowired
	HotelServiceImpl hotelservice;

	public void start() {
		System.out.println("\nHOTELS\n==============================");

		System.out.println(hotelservice.addHotel("Taj Hotel","Mumbai").toString());
		System.out.println(hotelservice.addHotel("JW Marriott","Delhi").toString());
		System.out.println(hotelservice.addHotel("Trident Bandra Kurla","Mumbai").toString());
		System.out.println(hotelservice.addHotel("Mannat International","Paharganj").toString());

	}


}
