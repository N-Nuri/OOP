package com.mycompany.runnerslog;

/**
 * Class rieng chi de chua main() - demo Date va Entry
 *
 * @author Nuri
 */
public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(1, 6, 2026);
        Entry e1 = new Entry(d1, 5.0, 45, "great");

        System.out.println("Ngay chay: " + e1.getDate().getDay() + "/" + e1.getDate().getMonth() + "/" + e1.getDate().getYear());
        System.out.println("Quang duong: " + e1.getDistance() + " dam");
        System.out.println("Thoi gian: " + e1.getDurationInMinutes() + " phut");
        System.out.println("Toc do: " + e1.computePace() + " phut/dam");
        System.out.println("Cam nhan: " + e1.getPostRunFeeling());
    }
}
