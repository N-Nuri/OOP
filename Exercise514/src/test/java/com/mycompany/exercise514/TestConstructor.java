package com.mycompany.exercise514;

import junit.framework.TestCase;

public class TestConstructor extends TestCase {

    public void testConstructor() {
        // tao Date va cac TemperatureRange
        Date date = new Date(15, 6, 2024);
        TemperatureRange today = new TemperatureRange(75, 60);
        TemperatureRange normal = new TemperatureRange(70, 55);
        TemperatureRange record = new TemperatureRange(90, 40);
        assertNotNull(date);
        assertNotNull(today);
        assertNotNull(normal);
        assertNotNull(record);

        // tao 1 WeatherRecord tu Date + 3 TemperatureRange + precipitation
        WeatherRecord r1 = new WeatherRecord(date, today, normal, record, 0.2);
        assertNotNull(r1);

        // weather report rong - dau danh sach
        AList report = new Empty();
        assertTrue(report instanceof Empty);

        // them WeatherRecord vao report bang Cons
        report = new Cons(r1, report);
        assertTrue(report instanceof Cons);

        Date date2 = new Date(16, 6, 2024);
        WeatherRecord r2 = new WeatherRecord(date2,
                new TemperatureRange(78, 62),
                new TemperatureRange(70, 55),
                new TemperatureRange(90, 40),
                0.0);
        report = new Cons(r2, report);

        // report cuoi cung phai la Cons (khong null, khong nem exception luc construct)
        assertNotNull(report);
        assertTrue(report instanceof Cons);
    }
}
