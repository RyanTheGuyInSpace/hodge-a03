/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesTest {

    @Test
    void removeEmployee() {

        Employees emp = new Employees();

        emp.removeEmployee("John Smith");

        assertEquals(4, emp.employees.size());
    }
}