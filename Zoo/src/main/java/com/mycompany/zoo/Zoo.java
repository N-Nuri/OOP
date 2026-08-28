package com.mycompany.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimals(Animal animal) {
        if (animal != null) {
            animals.add(animal);
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public double getTotalWeight() {
        double total = 0;
        for (Animal animal : animals) {
            total += animal.getWeight();
        }
        return total;
    }

    public void listAnimal() {
        System.out.println("List of animals: ");
        for (Animal animal : animals) {
            animal.listAnimal();
        }
    }
}
