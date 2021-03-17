package com.cg.apps.hotelbooking.guestms.ui;

import com.cg.apps.hotelbooking.guestms.services.GuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GuestConsoleUI {

    @Autowired
    GuestServiceImpl guestService;

    public void start(){
        System.out.println("\nGUESTS\n==============================");

        System.out.println(guestService.addGuest("Raja").toString());
        System.out.println(guestService.addGuest("Shipra").toString());
        System.out.println(guestService.addGuest("Tanisha").toString());
        System.out.println(guestService.addGuest("Arpit").toString());
        System.out.println(guestService.addGuest("Yash").toString());
    }

}
