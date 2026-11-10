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

    @Test
    void checkIn_should_makeRoomDirty() {
        Room room = new Room(2, 124.00, false, false);

        room.checkIn();

        boolean actualDirty = room.isDirty();
        assertEquals(true, actualDirty);
    }

    @Test
    void checkOut_should_makeRoomNotOccupied() {
        Room room = new Room(2, 124.00, true, true);

        room.checkOut();

        boolean actualOccupied = room.isOccupied();
        assertEquals(false, actualOccupied);
    }

    @Test
    void checkOut_should_leaveRoomDirty() {
        Room room = new Room(2, 124.00, true, true);

        room.checkOut();

        boolean actualDirty = room.isDirty();
        assertEquals(true, actualDirty);
    }

    @Test
    void cleanRoom_should_makeRoomNotDirty() {
        Room room = new Room(2, 124.00, false, true);

        room.cleanRoom();

        boolean actualDirty = room.isDirty();
        assertEquals(false, actualDirty);
    }

    @Test
    void cleanRoom_should_makeEmptyRoomAvailable() {
        Room room = new Room(2, 124.00, false, true);

        room.cleanRoom();

        boolean actualAvailable = room.isAvailable();
        assertEquals(true, actualAvailable);
    }

    @Test
    void checkIn_should_doNothing_whenRoomIsOccupied() {
        Room room = new Room(1, 139.00, true, false);

        room.checkIn();

        boolean actualDirty = room.isDirty();
        assertEquals(false, actualDirty);
    }

    @Test
    void checkIn_should_doNothing_whenRoomIsDirty() {
        Room room = new Room(1, 139.00, false, true);

        room.checkIn();

        boolean actualOccupied = room.isOccupied();
        assertEquals(false, actualOccupied);
    }

    @Test
    void cleanRoom_should_doNothing_whenRoomIsOccupied() {
        Room room = new Room(1, 139.00, true, true);

        room.cleanRoom();

        boolean actualDirty = room.isDirty();
        assertEquals(true, actualDirty);
    }
}
