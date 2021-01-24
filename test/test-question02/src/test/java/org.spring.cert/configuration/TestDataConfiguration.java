package org.spring.cert.configuration;

import org.spring.cert.ds.Room;
import org.spring.cert.service.HotelManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class TestDataConfiguration {

    public static final String GREEN_ROOM = "Green Room";
    public static final String YELLOW_ROOM = "Yellow Room";
    public static final String BLUE_ROOM = "Blue Room";

    @Autowired
    private HotelManagementService hotelManagementService;

    @PostConstruct
    private void registerHotelRooms() {
        hotelManagementService.registerRoom(new Room(GREEN_ROOM, "A01"));
        hotelManagementService.registerRoom(new Room(YELLOW_ROOM, "A02"));
        hotelManagementService.registerRoom(new Room(BLUE_ROOM, "B01"));
    }
}
