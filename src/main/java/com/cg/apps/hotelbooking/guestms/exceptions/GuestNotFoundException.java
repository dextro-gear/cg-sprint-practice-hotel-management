package com.cg.apps.hotelbooking.guestms.exceptions;

public class GuestNotFoundException extends RuntimeException{
    public GuestNotFoundException() {
        super("Guest was not found");
    }

    public GuestNotFoundException(String message) {
        super(message);
    }
}
