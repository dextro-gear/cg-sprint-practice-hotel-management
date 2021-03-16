package com.cg.apps.hotelbooking.roomms.dao;

import com.cg.apps.hotelbooking.roomms.entities.Room;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepository extends JpaRepository<Room, Long> {

    Room addRoom(long hotelID, int floorNo, int roomNo, double cost);
    Room findById(long roomID);
    Room retrieveRoom(int floorNo, int roomNo);
    List<Room> retrieveAllRooms(long hotelID);

}
