package com.mycompany.realestate;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address(23, "Maple Street", "Brookline");
        House h1 = new House("Ranch", 7, a1, 375.000);

        System.out.println("House created successfully.");
    }
}
