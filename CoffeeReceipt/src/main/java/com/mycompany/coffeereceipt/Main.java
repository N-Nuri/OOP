package com.mycompany.coffeereceipt;

public class Main {
    public static void main(String[] args) {
        CoffeeReceipt hk = new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
        System.out.println("Selling cost: " + hk.sellingCost());
    }
}
