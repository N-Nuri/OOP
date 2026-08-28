package com.mycompany.zoo;

public class Snake extends Animal {

    private double length;

    public Snake(String name, double weight, double length) {
        super(name, weight);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public String getLengthInfo() {
        return "Length: " + length;
    }

    @Override
    public void listAnimal() {
        System.out.println("Name: " + name + " ||| Weight: " + weight + " ||| " + getLengthInfo());
    }
}
