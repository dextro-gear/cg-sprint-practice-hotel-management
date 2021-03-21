package com.cg.apps.hotelbooking.roomms.dto;

public class RoomRequestDetails {
    private int floorNumber;
    private int roomNumber;
    private boolean available;
    private double cost;

    public RoomRequestDetails(int floorNumber, int roomNumber, boolean available, double cost) {
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.available = available;
        this.cost = cost;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
