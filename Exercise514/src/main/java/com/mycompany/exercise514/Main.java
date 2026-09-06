package com.mycompany.exercise514;

// Exercise 5.1.4
public class Main {
    public static void main(String[] args) {
        AList report = new Empty();

        WeatherRecord r1 = new WeatherRecord(
                new Date(15, 6, 2024),
                new TemperatureRange(75, 60),
                new TemperatureRange(70, 55),
                new TemperatureRange(90, 40),
                0.2);
        report = new Cons(r1, report);
    }
}
