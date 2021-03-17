package com.cg.apps.hotelbooking.roomms.exceptions;

public class RoomNotFoundException extends RuntimeException{
    public RoomNotFoundException() {
        super("Room was not found");
    }

    public RoomNotFoundException(String message) {
        super(message);
    }
}
