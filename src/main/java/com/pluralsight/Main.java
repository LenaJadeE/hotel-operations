package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Room clean = new Room(2, 124.00, false, false);
        Room dirty = new Room(2, 124.00, false, true);
        Room occupied = new Room(2, 124.00, true, false);

        System.out.println("Clean and empty is available: " + clean.isAvailable());
        System.out.println("Dirty is available: " + dirty.isAvailable());
        System.out.println("Occupied is available: " + occupied.isAvailable());
        System.out.printf("Clean room price: $%.2f%n", clean.getPrice());
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

        Guest guest = new Guest("Dana", "Reyes", "817-555-0142");
        System.out.println(guest.getFullName() + ", phone " + guest.getPhone());
        System.out.println("Checked in: " + guest.isCheckedIn() + ", stays: " + guest.getNumberOfStays()
                + ", returning guest: " + guest.isReturningGuest());
        guest.checkIn();
        System.out.println("After check in: checked in " + guest.isCheckedIn() + ", stays " + guest.getNumberOfStays());
        guest.checkOut();
        System.out.println("After check out: checked in " + guest.isCheckedIn() + ", stays " + guest.getNumberOfStays()
                + ", returning guest: " + guest.isReturningGuest());
        System.out.println();

        Receipt receipt = new Receipt(guest.getFullName(), 204, 3, 152.90, 42.50);
        System.out.println("Receipt for " + receipt.getGuestName() + ", room " + receipt.getRoomNumber());
        System.out.printf("Room charges: $%.2f%n", receipt.getRoomCharges());
        System.out.printf("Other charges: $%.2f%n", receipt.getOtherCharges());
        System.out.printf("Total: $%.2f%n", receipt.getTotal());
        System.out.println();

        Employee twentyHours = new Employee(1, "Ana Torres", "Housekeeping", 20.00, 20);
        Employee fortyFiveHours = new Employee(2, "Ben Ortiz", "Front Desk", 20.00, 45);

        printEmployee(twentyHours);
        printEmployee(fortyFiveHours);

    }

    private static void printEmployee(Employee employee) {
        System.out.printf("%s worked %.0f hours: %.0f regular, %.0f overtime, pay $%.2f%n",
                employee.getName(), employee.getHoursWorked(), employee.getRegularHours(),
                employee.getOvertimeHours(), employee.getTotalPay());
    }
}
