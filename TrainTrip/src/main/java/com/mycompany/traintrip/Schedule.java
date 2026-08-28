package com.mycompany.traintrip;

/**
 *
 * @author Nuri
 */
public class Schedule {
    private ClockTime departureTime;
    private ClockTime arrivalTime;

    public Schedule(ClockTime departureTime, ClockTime arrivalTime) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public ClockTime getDepartureTime() {
        return departureTime;
    }

    public ClockTime getArrivalTime() {
        return arrivalTime;
    }
}
