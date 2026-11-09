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



    }
}
