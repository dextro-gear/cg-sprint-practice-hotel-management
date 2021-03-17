package com.cg.apps.hotelbooking.roomms.services;

import com.cg.apps.hotelbooking.hotelms.dao.IHotelRepository;
import com.cg.apps.hotelbooking.hotelms.entity.Hotel;
import com.cg.apps.hotelbooking.hotelms.exceptions.HotelNotFoundException;
import com.cg.apps.hotelbooking.hotelms.service.IHotelService;
import com.cg.apps.hotelbooking.roomms.dao.IRoomRepository;
import com.cg.apps.hotelbooking.roomms.entities.Room;
import com.cg.apps.hotelbooking.roomms.exceptions.RoomNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements IRoomService {

	@Autowired
	private IRoomRepository roomRepository;

	@Autowired
	private IHotelRepository hotelRepository;

	@Autowired
	IHotelService hotelService;

	@Override
	public Room addRoom(long hotelID, int floorNo, int roomNo, double cost) {
		Optional<Hotel> optional = hotelRepository.findById(hotelID);
		if (!optional.isPresent()) {
			throw new HotelNotFoundException("Hotel is not found for this id");
		}

		Hotel hotel = hotelService.findById(hotelID);
		Room room = new Room(hotel, floorNo, roomNo, true, cost);
		room = roomRepository.save(room);
		List<Room> roomsList = hotel.getRoomsList();
		roomsList.add(room);
		hotelRepository.save(hotel);
		return room;
	}

	@Override
	public Room findByID(long roomID) {
		Optional<Room> roomOptional = roomRepository.findById(roomID);
		if (!roomOptional.isPresent())
			throw new RoomNotFoundException("Room with id " + roomID + " was not found in the DB");
		return roomOptional.get();
	}

	@Override
	public Room findRoom(long hotelID, int floorNo, int roomNo) {
		Hotel hotel = hotelService.findById(hotelID);
		List<Room> roomList = hotel.getRoomsList();
		for (Room room : roomList) {
			if (!((room.getFloorNumber() == floorNo) && (room.getRoomNumber() == roomNo))) {

				throw new RoomNotFoundException("Room is not found in this hotel");
			} else {
				return room;
			}
		}
		return null;

	}

	@Override
	public List<Room> retrieveAllRoomsInHotel(long hotelID) {
		Hotel hotel =hotelService.findById(hotelID);
		return hotel.getRoomsList();
		
	}

	@Override
	public List<Room> availableRoomsInHotel(long hotelID) {
		Hotel hotel =hotelService.findById(hotelID);
		List<Room> availableRoomList=new ArrayList<>();
		List<Room> roomList = hotel.getRoomsList();
		for(Room room:roomList) {
			if(room.isAvailable()) {
				availableRoomList.add(room);
			}
		}
	return availableRoomList;
		
	}
}
