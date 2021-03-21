package com.cg.apps.hotelbooking.hotelms.dto;

import com.cg.apps.hotelbooking.roomms.dto.SimpleRoomJSON;

import java.util.List;

public class HotelJSON implements IHotelJSON{

    private Long id;
    private String name;
    private String address;
    private List<SimpleRoomJSON> rooms;

    public HotelJSON(Long id, String name, String address, List<SimpleRoomJSON> rooms) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rooms = rooms;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<SimpleRoomJSON> getRooms() {
        return rooms;
    }

    public void setRooms(List<SimpleRoomJSON> rooms) {
        this.rooms = rooms;
    }
}
