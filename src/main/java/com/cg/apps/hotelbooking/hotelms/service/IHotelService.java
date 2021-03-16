package com.cg.apps.hotelbooking.hotelms.service;

import com.cg.apps.hotelbooking.hotelms.entity.*;

public interface IHotelService {
	Hotel findbyId(Long hotelId);
	Hotel addHotel(String hotelName,String adderss);

}
