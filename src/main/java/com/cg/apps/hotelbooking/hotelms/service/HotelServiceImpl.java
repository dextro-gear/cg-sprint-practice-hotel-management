package com.cg.apps.hotelbooking.hotelms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.apps.hotelbooking.hotelms.dao.IHotelDao;
import com.cg.apps.hotelbooking.hotelms.entity.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {
	@Autowired
	private IHotelDao dao;

	@Override
	public Hotel findbyId(Long hotelId) {
		Hotel hotel = dao.findbyId(hotelId);
		return hotel;
	}
	@Transactional
	@Override
	public Hotel addHotel(String hotelName, String address) {
		Hotel hotel=new Hotel(hotelName,address);
		dao.addHotel(hotel);
		return hotel;
	}

}
