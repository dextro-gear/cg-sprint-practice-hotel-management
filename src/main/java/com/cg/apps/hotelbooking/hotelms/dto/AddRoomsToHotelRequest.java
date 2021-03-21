package com.cg.apps.hotelbooking.hotelms.dto;

import com.cg.apps.hotelbooking.roomms.dto.RoomRequestDetails;
import com.cg.apps.hotelbooking.roomms.dto.SimpleRoomJSON;

import java.util.List;

public class AddRoomsToHotelRequest {

    private long hotelID;
    private List<RoomRequestDetails> rooms;

    public AddRoomsToHotelRequest(long hotelID, List<RoomRequestDetails> rooms) {
        this.hotelID = hotelID;
        this.rooms = rooms;
    }

    public long getHotelID() {
        return hotelID;
    }

    public void setHotelID(long hotelID) {
        this.hotelID = hotelID;
    }

    public List<RoomRequestDetails> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomRequestDetails> rooms) {
        this.rooms = rooms;
    }
}
