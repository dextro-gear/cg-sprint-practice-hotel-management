package com.cg.apps.hotelbooking;

import com.cg.apps.hotelbooking.hotelms.ui.HotelUi;
import com.cg.apps.hotelbooking.roomms.ui.RoomConsoleUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HotelbookingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HotelbookingApplication.class, args);

		RoomConsoleUI roomUI = context.getBean(RoomConsoleUI.class);
		roomUI.start();

		HotelUi hotelUI = context.getBean(HotelUi.class);
		hotelUI.start();
	}

}
