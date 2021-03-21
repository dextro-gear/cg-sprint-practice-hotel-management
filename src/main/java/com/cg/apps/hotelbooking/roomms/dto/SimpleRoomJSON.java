package com.cg.apps.hotelbooking.roomms.dto;

public class SimpleRoomJSON {

    private long roomID;
    private int floorNumber;
    private int roomNumber;
    private boolean available;
    private double cost;

    public SimpleRoomJSON(long roomID, int floorNumber, int roomNumber, boolean available, double cost) {
        this.roomID = roomID;
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.available = available;
        this.cost = cost;
    }

    public long getRoomID() {
        return roomID;
    }

    public void setRoomID(long roomID) {
        this.roomID = roomID;
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
