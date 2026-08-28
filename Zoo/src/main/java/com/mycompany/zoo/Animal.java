package com.mycompany.zoo;

/**
 * Bai Zoo - lop truu tuong dai dien cho mot con vat trong so thu
 *
 * @author Nuri
 */
public abstract class Animal {
    protected String name;
    protected double weight;

    protected Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void listAnimal() {
        System.out.println("Name: " + name + " ||| Weight: " + weight);
    }
}
