package org.spring.cert.application;

import org.spring.cert.ds.Guest;
import org.spring.cert.ds.Room;
import org.spring.cert.service.GuestRegistrationService;
import org.spring.cert.service.GuestSharableDataService;
import org.spring.cert.service.HotelManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ApplicationService {

    @Autowired
    private GuestRegistrationService guestRegistrationService;
    @Autowired
    private HotelManagementService hotelManagementService;
    @Autowired
    private GuestSharableDataService guestSharableDataService;

    public Set<Room> listRooms() {
        return hotelManagementService.listRooms();
    }

    public List<Guest> listGuests() {
        return guestRegistrationService.listGuests();
    }

    public String getGuestSharableData() {
        return guestSharableDataService.getGuestSharableData();
    }
}
