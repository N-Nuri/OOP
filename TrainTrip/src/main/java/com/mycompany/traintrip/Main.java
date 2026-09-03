package com.mycompany.traintrip;

public class Main {
    public static void main(String[] args) {
        Route r = new Route("New York", "Boston");
        ClockTime d = new ClockTime(23, 50);
        ClockTime a = new ClockTime(13, 20);
        Schedule s = new Schedule(d, a);
        TrainTrip trip = new TrainTrip(r, s, true);

        System.out.println("TrainTrip created successfully.");
    }
}
