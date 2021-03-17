package com.cg.apps.hotelbooking.roomms.services;

import com.cg.apps.hotelbooking.roomms.dao.IRoomRepository;
import com.cg.apps.hotelbooking.roomms.entities.Room;
import com.cg.apps.hotelbooking.roomms.exceptions.RoomNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements IRoomService{

    @Autowired
   private IRoomRepository roomRepository;

    @Override
    public Room addRoom(long hotelID, int floorNo, int roomNo, double cost) {
        Room room = new Room(floorNo, roomNo, true, cost);
        return roomRepository.save(room);
    }

    @Override
    public Room findByID(long roomID) {
        Optional<Room> roomOptional = roomRepository.findById(roomID);
        if(!roomOptional.isPresent())
            throw new RoomNotFoundException("Room with id " + roomID + " was not found in the DB");
        return roomOptional.get();
    }

    @Override
    public Room retrieveRoom(int floorNo, int roomNo) {
        return null;
    }

    @Override
    public List<Room> retrieveAllRoomsInHotel(long hotelID) {
        return null;
    }

    @Override
    public List<Room> availableRoomsInHotel(long hotelID) {
        return null;
    }
}
