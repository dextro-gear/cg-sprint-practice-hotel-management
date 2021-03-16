package com.cg.apps.hotelbooking.roomms.dao;

import com.cg.apps.hotelbooking.roomms.entities.Room;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class RoomDAOImpl implements IRoomDAO{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public Room addRoom(long hotelID, int floorNo, int roomNo, double cost) {
        Room room = new Room(floorNo, roomNo, true, cost);
        entityManager.persist(room);
        return entityManager.find(Room.class, room.getRoomID());
    }

    public Room addRoom(long hotelID, int floorNo, int roomNo) {
        Room room = new Room(floorNo, roomNo, true, 1000);
        entityManager.persist(room);
        return entityManager.find(Room.class, room.getRoomID());
    }

    @Override
    public Room findById(long roomID) {
        return entityManager.find(Room.class, roomID);
    }

    @Override
    public Room retrieveRoom(int floorNo, int roomNo) {
        return null;
    }

    @Override
    public List<Room> retrieveAllRooms(long hotelID) {
        return null;
    }
}
