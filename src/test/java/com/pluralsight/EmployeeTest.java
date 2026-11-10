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
}
