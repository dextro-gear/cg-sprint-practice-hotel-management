package com.cg.apps.hotelbooking.hotelms.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.apps.hotelbooking.hotelms.dao.IHotelRepository;
import com.cg.apps.hotelbooking.hotelms.entity.Hotel;
import com.cg.apps.hotelbooking.hotelms.exceptions.HotelNotFoundException;
import com.cg.apps.hotelbooking.roomms.entities.Room;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository hotelRepository;

	@Override
	public Hotel findById(Long hotelId) {
		Optional<Hotel> optional= hotelRepository.findById(hotelId);
		if(!optional.isPresent()) {
			throw new HotelNotFoundException("Hotel is not found for the entered id");
		}
		return optional.get();
	}
	
	@Transactional
	@Override
	public Hotel addHotel(String hotelName, String address, List<Room> rooms) {
		return hotelRepository.save(new Hotel(hotelName,address,rooms));
	}
	@Transactional
	public Hotel addHotel(String hotelName, String address) {
		return hotelRepository.save(new Hotel(hotelName,address));
	}

}
