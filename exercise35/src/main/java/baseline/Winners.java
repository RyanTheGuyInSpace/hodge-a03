/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Winners {
    private List<String> names = new LinkedList<>();

    /**
     * Picks a random name from the winners list and print them out as the winner
     */
    public void getWinner() {
        Random rand = new Random();

        System.out.printf("The winner is ...%s", this.names.get(rand.nextInt(names.size() - 1)));
    }

    /**
     * Adds the provided name to the list of names.
     * @param name The name to add to the list of names.
     */
    public void addName(String name) {
        this.names.add(name);
    }

    /**
     * Counts the number of names in the names list and returns the value.
     * @return The number of names in the names list.
     */
    public int countNames() {
        return this.names.size();
    }

}
