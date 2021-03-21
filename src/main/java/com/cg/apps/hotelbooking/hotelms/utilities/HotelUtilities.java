package com.cg.apps.hotelbooking.hotelms.utilities;

import com.cg.apps.hotelbooking.hotelms.dto.HotelJSON;
import com.cg.apps.hotelbooking.hotelms.dto.IHotelJSON;
import com.cg.apps.hotelbooking.hotelms.dto.SimpleHotelJSON;
import com.cg.apps.hotelbooking.hotelms.entity.Hotel;
import com.cg.apps.hotelbooking.roomms.utilities.RoomUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelUtilities {

    @Autowired
    RoomUtilities roomUtil;

    public IHotelJSON toJSON(Hotel hotel){
        if(hotel.getRoomsList() == null)
            return new SimpleHotelJSON(hotel.getHotelId(), hotel.getHotelName(), hotel.getAddress());
        else
            return new HotelJSON(hotel.getHotelId(), hotel.getHotelName(), hotel.getAddress(), roomUtil.toJSON(hotel.getRoomsList()));
    }


}
