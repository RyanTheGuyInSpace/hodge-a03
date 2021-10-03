/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.ArrayList;
import java.util.regex.Pattern;

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
    private String zipCode;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Validates the first name.
     * @return 1 if the first name is empty, 3 if the first name is too short, -1 if the name is OK.
     */
    public int validateFirstName() {
        if (this.firstName.isEmpty()) {
            return EmployeeValidationCode.FIRST_NAME_IS_EMPTY;
        }

        if (this.firstName.length() < 2) {
            return EmployeeValidationCode.FIRST_NAME_TOO_SHORT;
        }

        return -1;
    }

    /**
     * Validates the last name.
     * @return 2 if the last name is empty, 4 if the last name is too short, -1 if the name is OK.
     */
    public int validateLastName() {
        if (this.lastName.isEmpty()) {
            return EmployeeValidationCode.LAST_NAME_IS_EMPTY;
        }

        if (this.lastName.length() < 2) {
            return EmployeeValidationCode.LAST_NAME_TOO_SHORT;
        }

        return -1;
    }

    /**
     * Validates the employee's id.
     * @return 5 if the id isn't in the correct format, -1 if the id is OK.
     */
    public int validateID() {
        if(!Pattern.matches("[a-zA-Z]{2}-[0-9]{4}", this.id)) {
            return EmployeeValidationCode.INVALID_ID_FORMAT;
        }

        return -1;
    }

    /**
     * Validates the employee's zip code.
     * @return 6 if the zip code is invalid, -1 if the zip code is OK.
     */
    public int validateZipCode() {
        if(!Pattern.matches("[0-9]{5}", this.zipCode)) {
            return EmployeeValidationCode.INVALID_ZIP_CODE;
        }

        return -1;
    }

    /**
     * Validates an employee and fills the provided ArrayList with EmployeeValidationCodes.
     * @param list The list to fill with EmployeeValidationCodes relating to the input Employee.
     */
    public void validateInput(ArrayList<Integer> list) {

        int validator;

        validator = this.validateFirstName();

        list.add(validator);

        validator = this.validateLastName();

        list.add(validator);

        validator = this.validateID();

        list.add(validator);

        validator = this.validateZipCode();

        list.add(validator);
    }
}
