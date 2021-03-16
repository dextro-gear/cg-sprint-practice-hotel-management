package com.cg.apps.hotelbooking.hotelms.service;


import java.util.*;

import com.cg.apps.hotelbooking.hotelms.entity.*;
import com.cg.apps.hotelbooking.roomms.entities.Room;

public interface IHotelService {
	Hotel findbyId(Long hotelId);

	Hotel addHotel(String hotelName, String adderss,List<Room> rooms);

}
