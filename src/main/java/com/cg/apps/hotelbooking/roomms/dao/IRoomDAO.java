package com.cg.apps.hotelbooking.roomms.dao;

import com.cg.apps.hotelbooking.roomms.entities.Room;

import java.util.List;

public interface IRoomDAO {

    Room addRoom(long hotelID, int floorNo, int roomNo, double cost);
    Room findById(long roomID);
    Room retrieveRoom(int floorNo, int roomNo);
    List<Room> retrieveAllRooms(long hotelID);

}
