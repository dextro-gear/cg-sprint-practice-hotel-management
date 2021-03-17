package com.cg.apps.hotelbooking.hotelms.controllers;

import com.cg.apps.hotelbooking.hotelms.dto.AddNewHotelRequest;
import com.cg.apps.hotelbooking.hotelms.service.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/hotel")
public class HotelRESTController {

    @Autowired
    HotelServiceImpl hotelService;

    /*
     * Add Hotel.
     * Find hotel by ID.
     * Find all guests living in a hotel.
     * Find all guests checked out today.
     */

    @PostMapping("/add")
    public String addNewHotel(@RequestBody AddNewHotelRequest request){
        return "Name: " + request.getName() + " Address: " + request.getAddress();
    }

    @GetMapping("/find/byID/{id}")
    public String finHotelByID(@PathVariable("id") int id){
        return "Hotel #" + id;
    }

    @GetMapping("/find/guests/{id}")
    public String findGuestsInHotel(@PathVariable("id") int id){
        return "Guests in Hotel #" + id;
    }

    @GetMapping("/find/guests/checkout/{id}")
    public String guestsWhoCheckedOut(@PathVariable("id") int id){
        return "Guests who checked out today at Hotel #" + id;
    }

}
