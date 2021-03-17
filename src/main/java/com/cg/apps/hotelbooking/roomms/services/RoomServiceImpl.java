package com.cg.apps.hotelbooking.roomms.services;

import com.cg.apps.hotelbooking.roomms.dao.IRoomRepository;
import com.cg.apps.hotelbooking.roomms.entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService{

    @Autowired
   private IRoomRepository roomRepository;

    @Override
    public Room addRoom(long hotelID, int floorNo, int roomNo, double cost) {
        return roomRepository.addRoom(hotelID, floorNo, roomNo, cost);
    }

    @Override
    public Room findByID(long roomID) {
        return roomRepository.findById(roomID);
    }

    @Override
    public Room retrieveRoom(int floorNo, int roomNo) {
        return roomRepository.retrieveRoom(floorNo, roomNo);
    }

    @Override
    public List<Room> retrieveAllRoomsInHotel(long hotelID) {
        return roomRepository.retrieveAllRooms(hotelID);
    }

    @Override
    public List<Room> availableRoomsInHotel(long hotelID) {
        return null;
    }
}
