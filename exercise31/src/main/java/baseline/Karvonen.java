/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

public class Karvonen {

    /**
     * Calculates the Karvonen heart rate for someone of the given age, resting heart rate and intensity.
     * @param age The age of the person.
     * @param restingHeartRate The resting heart rate of the person.
     * @param intensity The intensity of the workout, as a percentage between 0 and 100.
     * @return The calculated Karvonen heart rate in BPM.
     *
     * TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
     */
    public static int calculateKarvonenHeartRate(int age, int restingHeartRate, int intensity) {
        return (int)Math.round((((220 - age) - restingHeartRate) * (intensity / 100.0)) + restingHeartRate);
    }
}
