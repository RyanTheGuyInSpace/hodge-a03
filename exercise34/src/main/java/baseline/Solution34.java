/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        // Print out all the employees inside the list
        // Prompt the user to type the name of the employee to remove from the list
        // After removal, print the new list of employees

        Scanner scan = new Scanner(System.in);

        Employees list = new Employees();

        System.out.printf("There are %d employees.%n", list.employees.size());

        list.printEmployees();

        System.out.println("Enter an employee name to remove: ");

        list.removeEmployee(scan.nextLine().trim());

        System.out.printf("There are %d employees%n", list.employees.size());

        list.printEmployees();

    }
}
