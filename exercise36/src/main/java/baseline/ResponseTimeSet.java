/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ResponseTimeSet {
    /**
     * The list of response times.
     */
    private List<Double> times = new LinkedList<>();

    /**
     * Calculates the average of the times.
     * @return The average of the times.
     */
    public double avg() {
        return this.sum() / times.size();
    }

    /**
     * Gets the maximum time in the times list.
     * @return The maximum time in the times list.
     */
    public double max() {
        return Collections.max(this.times);
    }

    /**
     * Gets the minimum time in the times list.
     * @return The minimum time in the times list.
     */
    public double min() {
        return Collections.min(this.times);
    }

    /**
     * Gets the standard deviation of the times in the times list.
     * @return The standard deviation of the times in the times list.
     */
    public double std() {
        double standardDeviation = 0.0;

        for(double num: this.times) {
            standardDeviation += Math.pow(num - this.avg(), 2);
        }

        DecimalFormat f = new DecimalFormat("##.00");

        return Double.parseDouble(f.format(Math.sqrt(standardDeviation / this.times.size())));
    }

    /**
     * Calculates the sum of all the times in the times list
     * @return The sum of all the times in the times list
     */
    public double sum() {
        double sum = 0;

        for (double i : this.times) {
            sum += i;
        }

        return sum;
    }

    /**
     * Adds the provided time to the times list.
     * @param n The time to add to the times list.
     */
    public void addTime(double n) {
        this.times.add(n);
    }

    /**
     * Prints out all the times in the times list.
     */
    public void printTimes() {

        StringBuilder builder = new StringBuilder();

        builder.append("Numbers: ");

        for(double i : this.times) {
            builder.append(String.format(" %.2f,", i));
        }

        builder.append("\n");
        builder.deleteCharAt(builder.lastIndexOf(","));

        System.out.println(builder.toString());
    }
}
