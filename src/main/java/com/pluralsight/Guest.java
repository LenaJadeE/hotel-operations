package com.pluralsight;

public class Guest {

    private String firstName;
    private String lastName;
    private String phone;
    private boolean checkedIn;
    private int numberOfStays;

    public Guest(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.checkedIn = false;
        this.numberOfStays = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public int getNumberOfStays() {
        return numberOfStays;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isReturningGuest() {
        return numberOfStays > 0;
    }

    public void checkIn() {
            checkedIn = true;
    }

    public void checkOut() {
        if (checkedIn) {
            checkedIn = false;
            numberOfStays++;
        }
    }
}
