package com.cg.apps.hotelbooking.roomms.utilities;

import com.cg.apps.hotelbooking.roomms.dto.SimpleRoomJSON;
import com.cg.apps.hotelbooking.roomms.entities.Room;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoomUtilities {

    public SimpleRoomJSON toJSON(Room room){
        return new SimpleRoomJSON(room.getRoomID(), room.getFloorNumber(), room.getRoomNumber(), room.isAvailable(), room.getCost());
    }

    public List<SimpleRoomJSON> toJSON(List<Room> rooms){
        List<SimpleRoomJSON> returnList = new ArrayList<SimpleRoomJSON>();
        for(Room room : rooms){
            returnList.add(toJSON(room));
        }
        return returnList;
    }

}
