package com.cg.apps.hotelbooking.roomms.services;

import com.cg.apps.hotelbooking.roomms.dao.RoomDAOImpl;
import com.cg.apps.hotelbooking.roomms.entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService{

    @Autowired
    RoomDAOImpl roomDAO;

    @Override
    public Room addRoom(long hotelID, int floorNo, int roomNo, double cost) {
        return roomDAO.addRoom(hotelID, floorNo, roomNo, cost);
    }

    @Override
    public Room findByID(long roomID) {
        return roomDAO.findById(roomID);
    }

    @Override
    public Room retrieveRoom(int floorNo, int roomNo) {
        return roomDAO.retrieveRoom(floorNo, roomNo);
    }

    @Override
    public List<Room> retrieveAllRoomsInHotel(long hotelID) {
        return roomDAO.retrieveAllRooms(hotelID);
    }

    @Override
    public List<Room> availableRoomsInHotel(long hotelID) {
        return null;
    }
}
