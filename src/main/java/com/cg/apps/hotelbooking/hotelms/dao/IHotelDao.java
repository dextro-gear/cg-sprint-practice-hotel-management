package com.cg.apps.hotelbooking.hotelms.dao;

import com.cg.apps.hotelbooking.hotelms.entity.Hotel;

public interface IHotelDao {
	public Hotel findbyId(Long hotelId);

	public Hotel addHotel(Hotel hotel);

}
