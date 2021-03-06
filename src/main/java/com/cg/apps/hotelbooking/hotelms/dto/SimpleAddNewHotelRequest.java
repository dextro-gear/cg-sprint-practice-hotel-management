package com.cg.apps.hotelbooking.hotelms.dto;

public class SimpleAddNewHotelRequest {
    String name;
    String address;

    public SimpleAddNewHotelRequest(String name, String address) {
        this.name = name;
        this.address = address;
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
}
