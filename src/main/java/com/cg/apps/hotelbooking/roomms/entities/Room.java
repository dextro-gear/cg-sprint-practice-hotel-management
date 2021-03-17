package com.cg.apps.hotelbooking.roomms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.cg.apps.hotelbooking.hotelms.entity.Hotel;

@Entity
public class Room {

    @Id
    @GeneratedValue
    private long roomID;

    private int floorNumber;
    private int roomNumber;
    private boolean available;
    private double cost;

    @ManyToOne
    private Hotel hotel;

    public Room() { }

    public Room(int floorNumber, int roomNumber, boolean available, double cost) {
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.available = available;
        this.cost = cost;
    }

    public long getRoomID() {
        return roomID;
    }

    public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
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

    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", floorNumber=" + floorNumber +
                ", roomNumber=" + roomNumber +
                ", available=" + available +
                ", cost=" + cost +
                '}';
    }
}
