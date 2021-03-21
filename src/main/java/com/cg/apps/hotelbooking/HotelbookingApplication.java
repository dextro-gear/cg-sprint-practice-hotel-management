package com.cg.apps.hotelbooking;

import com.cg.apps.hotelbooking.guestms.ui.GuestConsoleUI;
import com.cg.apps.hotelbooking.hotelms.ui.HotelConsoleUI;
import com.cg.apps.hotelbooking.roomms.ui.RoomConsoleUI;
import org.springframework.boot.SpringApplication;q
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HotelbookingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HotelbookingApplication.class, args);

		HotelConsoleUI hotelUI = context.getBean(HotelConsoleUI.class);
		hotelUI.start();

		RoomConsoleUI roomUI = context.getBean(RoomConsoleUI.class);
		roomUI.start();

		GuestConsoleUI guestUI = context.getBean(GuestConsoleUI.class);
		guestUI.start();
	}

}
