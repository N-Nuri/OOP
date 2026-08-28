package com.mycompany.zoo;

public class Lion extends Animal {

    private double meatWeight;

    public Lion(String name, double weight, double meatWeight) {
        super(name, weight);
        this.meatWeight = meatWeight;
    }

    public double getMeatWeight() {
        return meatWeight;
    }

    public String getMeatWeightInfo() {
        return "Meat per day: " + meatWeight;
    }

    @Override
    public void listAnimal() {
        System.out.println("Name: " + name + " ||| Weight: " + weight + " ||| " + getMeatWeightInfo());
    }
}
