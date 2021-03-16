package com.cg.apps.hotelbooking.roomms.services;

import com.cg.apps.hotelbooking.roomms.entities.Room;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService{

    @Override
    public Room addRoom(long hotelID, int floorNo, int roomNo) {
        return null;
    }

    @Override
    public Room findByID(long roomID) {
        return null;
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
