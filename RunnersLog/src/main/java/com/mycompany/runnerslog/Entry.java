package com.mycompany.runnerslog;

/**
 * Bai 3.1.4 + 3.1.5 - Runner's log
 *
 * @author Nuri
 */
public class Entry {
    private Date date;
    private double distance;
    private int durationInMinutes;
    private String postRunFeeling;

    public Entry(Date date, double distance, int durationInMinutes, String postRunFeeling) {
        this.date = date;
        this.distance = distance;
        this.durationInMinutes = durationInMinutes;
        this.postRunFeeling = postRunFeeling;
    }

    public Date getDate() {
        return date;
    }

    public double getDistance() {
        return distance;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getPostRunFeeling() {
        return postRunFeeling;
    }

    // 3.1.4: tinh toc do chay, don vi phut/dam (minutes per mile)
    public double computePace() {
        return this.durationInMinutes / this.distance;
    }
}
