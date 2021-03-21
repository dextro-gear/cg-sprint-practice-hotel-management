package com.cg.apps.hotelbooking.hotelms.controllers;

import com.cg.apps.hotelbooking.hotelms.dto.*;
import com.cg.apps.hotelbooking.hotelms.service.HotelServiceImpl;
import com.cg.apps.hotelbooking.hotelms.utilities.HotelUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
public class HotelRESTController {

    @Autowired
    HotelServiceImpl hotelService;

    @Autowired
    HotelUtilities hotelUtil;

    /* TODO
     *  - Add Hotel.
     *  - Add Hotel with rooms.
     *  - Find hotel by ID.
     *  - Find all guests living in a hotel.
     *  - Find all guests checked out today.
     */

    @PostMapping("/add")
    public IHotelJSON addNewHotelWithoutRooms(@RequestBody SimpleAddNewHotelRequest request){
        return hotelUtil.toJSON(hotelService.addHotel(request.getName(), request.getAddress()));
    }

    @GetMapping("/find/byID/{id}")
    public IHotelJSON findHotelByID(@PathVariable("id") long id){
        return hotelUtil.toJSON(hotelService.findById(id));
    }

    @PostMapping("/addRoomsToHotel")
    public IHotelJSON addRoomsToHotel(@RequestBody AddRoomsToHotelRequest request){
        return hotelUtil.toJSON(hotelService.addRoomsToHotel(request.getHotelID(), request.getRooms()));
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
