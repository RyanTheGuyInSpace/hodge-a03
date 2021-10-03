/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        // Prompt the user for the first name, last name,
        // ID and ZIP code of the employee
        // Validate the inputs of the employee and add the validation confirmations to an ArrayList
        // Pull together all the validation confirmations and print them out at the end

        // Error messages:
        // The first name must be at least 2 characters long.
        // The last name must be at least 2 characters long.
        // The last name must be filled in.
        // The employee ID must be in the format of AA-1234.
        // The zipcode must be a 5 digit number.

        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter the first name:");

        employee.setFirstName(scan.nextLine());

        System.out.println("Enter the last name:");

        employee.setLastName(scan.nextLine());

        System.out.println("Enter the ID:");

        employee.setId(scan.nextLine());

        System.out.println("Enter the zip code:");

        employee.setZipCode(scan.nextLine());

        ArrayList<Integer> result = new ArrayList<Integer>();

        employee.validateInput(result);

        StringBuilder builder = new StringBuilder();

        if(result.contains(1)) {
            builder.append("The first name must be filled in.\n");
        }

        if (result.contains(2)) {
            builder.append("The last name must be filled in.\n");
        }

        if (result.contains(3)) {
            builder.append("The first name must be at least 2 characters long.\n");
        }

        if (result.contains(4)) {
            builder.append("The last name must be ast least 2 characters long.\n");
        }

        if (result.contains(5)) {
            builder.append("The employee ID must be in the format of AA-1234.\n");
        }

        if (result.contains(6)) {
            builder.append("The zipcode must be a 5 digit number.\n");
        }

        // If the result contains no error codes, add a success message saying there were no errors found
        if (!result.contains(1) &&
                !result.contains(2) &&
                !result.contains(3) &&
                !result.contains(4) &&
                !result.contains(5) &&
                !result.contains(6)) {
            builder.append("There were no errors found.");
        }

        System.out.println(builder.toString());
    }
}
