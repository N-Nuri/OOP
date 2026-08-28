package com.mycompany.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals(new Lion("Simba", 180.5, 5.5));
        zoo.addAnimals(new Monkey("Alex", 20.0, "Banana"));
        zoo.addAnimals(new Snake("Lucifer", 10.0, 6.23));

        zoo.listAnimal();
        System.out.println("Total weight: " + zoo.getTotalWeight());
    }
}
