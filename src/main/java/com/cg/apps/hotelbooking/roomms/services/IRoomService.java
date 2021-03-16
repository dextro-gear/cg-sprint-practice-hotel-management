package com.cg.apps.hotelbooking.roomms.dao;

import com.cg.apps.hotelbooking.roomms.entities.Room;

import java.util.List;

public interface IRoomService {

    Room addRoom(long hotelID, int floorNo, int roomNo);
    Room findByID(long roomID);
    Room retrieveRoom(int floorNo, int roomNo);
    List<Room> retrieveAllRoomsInHotel(long hotelID);
    List<Room> availableRoomsInHotel(long hotelID);

}
