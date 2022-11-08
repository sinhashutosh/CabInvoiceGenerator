package org.example;

import java.util.Scanner;

public class InvoiceGenerator {
    private static final int COST_PER_MINUTE = 1;
    private static final double COST_PER_KM = 10;
    private static final double MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        return Math.max(MINIMUM_FARE, (distance * COST_PER_KM + time * COST_PER_MINUTE));
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride.getDistance(), ride.getTime());
        }
        return totalFare;
    }
}