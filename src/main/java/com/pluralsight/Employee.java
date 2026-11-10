package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    private final int employeeId;
    private final String name;
    private final String department;
    private final double payRate;
    private double hoursWorked;
    private double startTime;
    private boolean punchedIn;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        }
        return hoursWorked;
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }

    public void punchIn(int time) {
        startTime = time;
        punchedIn = true;
    }

    public void punchIn() {
        startTime = getCurrentTime();
        punchedIn = true;
    }

    public void punchOut(int time) {
        hoursWorked += time - startTime;
        punchedIn = false;
    }

    public void punchOut() {
        hoursWorked += getCurrentTime() - startTime;
        punchedIn = false;
    }

    public void punchTimeCard(int time) {
        if (punchedIn) {
            punchOut(time);
        } else {
            punchIn(time);
        }
    }

    private double getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        return now.getHour() + now.getMinute() / 60.0;
    }
}