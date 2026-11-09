package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Room clean = new Room(2, 124.00, false, false);
        Room dirty = new Room(2, 124.00, false, true);
        Room occupied = new Room(2, 124.00, true, false);

        System.out.println("Clean and empty is available: " + clean.isAvailable());
        System.out.println("Dirty is available: " + dirty.isAvailable());
        System.out.println("Occupied is available: " + occupied.isAvailable());
        System.out.println();

        Reservation kingWeekend = new Reservation("king", 3, true);
        System.out.printf("King, 3 nights, weekend: $%.2f a night, $%.2f total%n",
                kingWeekend.getPrice(), kingWeekend.getReservationTotal());

        Reservation doubleWeekday = new Reservation("double", 2, false);
        System.out.printf("Double, 2 nights, weekday: $%.2f a night, $%.2f total%n",
                doubleWeekday.getPrice(), doubleWeekday.getReservationTotal());
        System.out.printf("King, 3 nights, weekend: weekend surcharge $%.2f a night%n", kingWeekend.getWeekendSurcharge());
        Reservation kingWeekday = new Reservation("king", 3, false);
        System.out.printf("King, 3 nights, weekday: weekend surcharge $%.2f a night%n", kingWeekday.getWeekendSurcharge());
        System.out.println();



    }
}
