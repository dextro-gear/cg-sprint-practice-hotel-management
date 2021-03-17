package com.cg.apps.hotelbooking.guestms.services;

import com.cg.apps.hotelbooking.guestms.entities.Guest;
import com.cg.apps.hotelbooking.guestms.entities.GuestTransaction;
import java.util.List;

public interface IGuestService {

    Guest findById(long guestId);
    Guest allotRoom(String aadharId, String guestName, long hotelId, int roomNumber, int floorNumber, double rent);
    List<GuestTransaction> getTransactionsHistory(Long guestId);
    Guest checkout(Long guestId, Long hotelId, int roomNumber, int floorNumber);
}
