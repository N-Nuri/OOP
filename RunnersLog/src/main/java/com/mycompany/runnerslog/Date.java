package com.mycompany.runnerslog;

/**
 * Bai 3.1.4 + 3.1.5 - Runner's log
 *
 * @author Nuri
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // 3.1.5: xac dinh ngay nay co truoc ngay kia khong
    // Uu tien so sanh: nam truoc -> thang truoc -> ngay truoc
    public boolean isBefore(Date other) {
        if (this.year != other.year) {
            return this.year < other.year;
        }
        if (this.month != other.month) {
            return this.month < other.month;
        }
        return this.day < other.day;
    }
}
