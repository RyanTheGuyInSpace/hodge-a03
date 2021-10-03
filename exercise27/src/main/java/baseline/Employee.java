/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.ArrayList;

public class Employee {

    /**
     * The Employee's first name.
     */
    private String firstName;

    /**
     * The Employee's last name.
     */
    private String lastName;

    /**
     * The Employee's ID.
     * Must be formatted as AA-1234.
     */
    private String id;

    /**
     * The Employee's ZIP code.
     */
    private int zipCode;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Validates either the first or last name.
     * @return 1 if the name is empty, 2 if the name is too short, -1 if the name is OK.
     */
    public int validateName() {

        return -1;
    }

    /**
     * Validates the employee's id.
     * @return 2 if the id isn't in the correct format, -1 if the id is OK.
     */
    public int validateID() {

        return -1;
    }

    /**
     * Validates the employee's zip code.
     * @return
     */
    public int validateZipCode() {

        return -1;
    }

    /**
     * Validates an employee and fills the provided ArrayList with EmployeeValidationCodes
     * @param list The list to fill with EmployeeValidationCodes relating to the input Employee
     */
    public void validateInput(ArrayList<Integer> list) {

    }
}
