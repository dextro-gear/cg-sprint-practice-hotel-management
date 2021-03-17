package com.cg.apps.hotelbooking.guestms.entities;

import com.cg.apps.hotelbooking.roomms.entities.Room;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Entity
public class Guest {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String aadharID;
    private LocalDateTime rentedTime;
    private LocalDateTime checkoutTime;

    @OneToMany
    private List<GuestTransaction> transactions;

    @OneToOne
    Room room;

    public Guest(String name, String aadharID, LocalDateTime rentedTime, Room room) {
        this.name = name;
        this.aadharID = aadharID;
        this.rentedTime = rentedTime;
        this.room = room;
    }

    public Guest(String name, String aadharID) {
        this.name = name;
        this.aadharID = aadharID;
    }

    public Guest(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharID() {
        return aadharID;
    }

    public void setAadharID(String aadharID) {
        this.aadharID = aadharID;
    }

    public LocalDateTime getRentedTime() {
        return rentedTime;
    }

    public void setRentedTime(LocalDateTime rentedTime) {
        this.rentedTime = rentedTime;
    }

    public LocalDateTime getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(LocalDateTime checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public List<GuestTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<GuestTransaction> transactions) {
        this.transactions = transactions;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public  void addToTransactions(GuestTransaction transaction){
        this.transactions.add(transaction);
    }

    public void addToTransactions(Collection<GuestTransaction> transactions){
        this.transactions.addAll(transactions);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aadharID='" + aadharID + '\'' +
                ", rentedTime=" + rentedTime +
                ", checkoutTime=" + checkoutTime +
                '}';
    }
}
