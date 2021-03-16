package com.cg.apps.hotelbooking.hotelms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.apps.hotelbooking.hotelms.entity.Hotel;

@Repository
public class HotelDaoImpl implements IHotelDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public Hotel findbyId(Long hotelId) {
		Hotel hotel = em.find(Hotel.class, hotelId);
		return hotel;

	}
@Transactional
	@Override
	public Hotel addHotel(Hotel hotel) {
		
		em.persist(hotel);
		return hotel;
	}

}
