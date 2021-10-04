/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Employees {
    public List<String> employees = new LinkedList<String>(Arrays.asList("John Smith",
            "Jackie Jackson",
            "Chris Jones",
            "Amanda Cullen",
            "Jeremy Goodwin"));

    /**
     * Prints all the employees insides the employees array
     */
    public void printEmployees() {
        for (String name : employees) {
            System.out.println(name);
        }
    }

    /**
     * Removes the employee with the given name from the employees array.
     * @param employeeName The name of the employee to remove from the employees array.
     */
    public void removeEmployee(String employeeName) {
        this.employees.removeIf(x -> x.equalsIgnoreCase(employeeName));
    }
}
