package com.cg.apps.hotelbooking.roomms.ui;

import com.cg.apps.hotelbooking.roomms.services.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoomConsoleUI {

    @Autowired
    RoomServiceImpl roomService;

    public void start(){

        System.out.println("\nROOMS\n==============================");

        System.out.println(roomService.addRoom(2, 1, 12, 2000).toString());
        System.out.println(roomService.addRoom(2, 1, 13, 1000).toString());
        System.out.println(roomService.addRoom(2, 1, 14, 2500).toString());
        System.out.println(roomService.addRoom(2, 1, 15, 3000).toString());
        System.out.println(roomService.addRoom(2, 1, 16, 2450).toString());

    }

}
