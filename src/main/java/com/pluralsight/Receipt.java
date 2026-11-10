package com.pluralsight;

public class Receipt {

    private final String guestName;
    private final int roomNumber;
    private final int numberOfNights;
    private final double pricePerNight;
    private final double otherCharges;

    public Receipt(String guestName, int roomNumber, int numberOfNights, double pricePerNight, double otherCharges) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.numberOfNights = numberOfNights;
        this.pricePerNight = pricePerNight;
        this.otherCharges = otherCharges;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public double getOtherCharges() {
        return otherCharges;
    }

    public double getRoomCharges() {
        return pricePerNight * numberOfNights;
    }

    public double getTotal() {
        return getRoomCharges() + otherCharges;
    }
}
