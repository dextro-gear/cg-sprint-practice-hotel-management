package com.cg.apps.hotelbooking.guestms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class GuestTransaction {

    @Id
    @GeneratedValue
    private long id;

    private double amount;
    private LocalDateTime dateTime;

    @ManyToOne
    private Guest guest;

    public GuestTransaction(long id, double amount, LocalDateTime dateTime, Guest guest) {
        this.id = id;
        this.amount = amount;
        this.dateTime = dateTime;
        this.guest = guest;
    }

    public GuestTransaction(long id, double amount, LocalDateTime dateTime) {
        this.id = id;
        this.amount = amount;
        this.dateTime = dateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "GuestTransaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", dateTime=" + dateTime +
                '}';
    }
}
