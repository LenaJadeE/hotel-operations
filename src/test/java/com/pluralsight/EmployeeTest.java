package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    void punchOut_should_addHoursWorked() {
        Employee employee = new Employee(1, "Ana Torres", "Housekeeping", 20.00, 0);
        double expectedHours = 4;

        employee.punchIn(10);
        employee.punchOut(14);

        double actualHours = employee.getHoursWorked();
        assertEquals(expectedHours, actualHours);
    }

    @Test
    void punchOut_should_addToExistingHours() {
        Employee employee = new Employee(1, "Ana Torres", "Housekeeping", 20.00, 20);
        double expectedHours = 24;

        employee.punchIn(10);
        employee.punchOut(14);

        double actualHours = employee.getHoursWorked();
        assertEquals(expectedHours, actualHours);
    }

    @Test
    void punchOut_should_addEachShift() {
        Employee employee = new Employee(1, "Ana Torres", "Housekeeping", 20.00, 0);
        double expectedHours = 12;

        employee.punchIn(10);
        employee.punchOut(14);
        employee.punchIn(9);
        employee.punchOut(17);

        double actualHours = employee.getHoursWorked();
        assertEquals(expectedHours, actualHours);
    }

    @Test
    void punchIn_should_notChangeHoursWorked() {
        Employee employee = new Employee(1, "Ana Torres", "Housekeeping", 20.00, 0);
        double expectedHours = 0;

        employee.punchIn(10);

        double actualHours = employee.getHoursWorked();
        assertEquals(expectedHours, actualHours);
    }

    @Test
    void punchTimeCard_should_punchOut_afterPunchIn() {
        Employee employee = new Employee(1, "Ana Torres", "Housekeeping", 20.00, 0);

        employee.punchIn(10);
        employee.punchTimeCard(14);

        double actualHours = employee.getHoursWorked();
        assertEquals(4.0, actualHours);
    }
}