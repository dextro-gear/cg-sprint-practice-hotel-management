package com.cg.apps.hotelbooking.hotelms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.apps.hotelbooking.hotelms.entity.Hotel;
@Repository
public interface IHotelRepository extends JpaRepository<Hotel,Long> {
	public Hotel findbyId(Long hotelId);

	public Hotel addHotel(Hotel hotel);

}
