package org.spring.cert.application;

import org.spring.cert.ds.Guest;
import org.spring.cert.ds.Room;
import org.spring.cert.service.GuestRegistrationService;
import org.spring.cert.service.HotelManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Service
public class ApplicationService {

    @Autowired
    private GuestRegistrationService guestRegistrationService;
    @Autowired
    private HotelManagementService hotelManagementService;

    public void registerGuests(Guest... guests) {
        Arrays.asList(guests).forEach(guestRegistrationService::registerGuest);
    }

    public void registerRooms(Room... rooms) {
        Arrays.asList(rooms).forEach(hotelManagementService::registerRoom);
    }

    public List<Guest> listGuests() {
        return guestRegistrationService.listGuests();
    }

    public Set<Room> listRooms() {
        return hotelManagementService.listRooms();
    }
}
