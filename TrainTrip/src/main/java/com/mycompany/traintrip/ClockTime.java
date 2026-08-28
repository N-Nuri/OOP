package com.mycompany.traintrip;

/**
 *
 * @author Nuri
 */
public class ClockTime {
    private int hour;
    private int minute;

    public ClockTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
