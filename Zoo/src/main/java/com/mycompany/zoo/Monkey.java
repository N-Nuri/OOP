package com.mycompany.zoo;

public class Monkey extends Animal {

    private String favouriteFood;

    public Monkey(String name, double weight, String favouriteFood) {
        super(name, weight);
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getFavouriteFoodInfo() {
        return "Favourite Food: " + favouriteFood;
    }

    @Override
    public void listAnimal() {
        System.out.println("Name: " + name + " ||| Weight: " + weight + " ||| " + getFavouriteFoodInfo());
    }
}
