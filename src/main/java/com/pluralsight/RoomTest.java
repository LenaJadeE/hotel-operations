package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomTest {

    @Test
    void checkIn_should_makeRoomOccupied() {
        Room room = new Room(2, 124.00, false, false);

        room.checkIn();

        boolean actualOccupied = room.isOccupied();
        assertEquals(true, actualOccupied);
    }

}
