package com.cg.apps.hotelbooking.guestms.services;

import com.cg.apps.hotelbooking.guestms.dao.IGuestRepository;
import com.cg.apps.hotelbooking.guestms.entities.Guest;
import com.cg.apps.hotelbooking.guestms.entities.GuestTransaction;
import com.cg.apps.hotelbooking.guestms.exceptions.GuestNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class GuestServiceImpl implements IGuestService{

    @Autowired
    IGuestRepository guestRepo;

    @Transactional
    public Guest addGuest(String name, String aadhaarID){
        return guestRepo.save(new Guest(name, aadhaarID));
    }

    @Transactional
    public Guest addGuest(String name){
        return guestRepo.save(new Guest(name));
    }

    @Transactional
    public Guest updateGuest(long guestID, String name, String aadhaarID){
        Optional<Guest> guestOptional = guestRepo.findById(guestID);
        if(!guestOptional.isPresent())
            throw new GuestNotFoundException("Guest with id:" + guestID + " does not exist");
        Guest guest = guestOptional.get();
        guest.setName(name);
        guest.setAadharID(aadhaarID);
        return guestRepo.save(guest);
    }

    public Guest updateGuest(long guestID, String name){
        Optional<Guest> guestOptional = guestRepo.findById(guestID);
        if(!guestOptional.isPresent())
            throw new GuestNotFoundException("Guest with id:" + guestID + " does not exist");
        Guest guest = guestOptional.get();
        guest.setName(name);
        return guestRepo.save(guest);
    }

    @Override
    public Guest findById(long guestId) {
        Optional<Guest> guestOptional = guestRepo.findById(guestId);
        if(!guestOptional.isPresent())
            throw new GuestNotFoundException("Guest with id:" + guestId + " was not found in the DB");
        return guestOptional.get();
    }

    @Override
    public Guest allotRoom(String aadharId, String guestName, long hotelId, int roomNumber, int floorNumber, double rent) {
        return null;
    }

    @Override
    public List<GuestTransaction> getTransactionsHistory(Long guestId) {
        return null;
    }

    @Override
    public Guest checkout(Long guestId, Long hotelId, int roomNumber, int floorNumber) {
        return null;
    }
}
