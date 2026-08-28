package com.mycompany.zoo;

import junit.framework.TestCase;

import java.util.List;

public class TestZoo extends TestCase {

    public void testLionCreationAndGetters() {
        Lion lion = new Lion("Simba", 180.5, 5.5);
        assertEquals("Simba", lion.getName());
        assertEquals(180.5, lion.getWeight(), 0.001);
        assertEquals("Meat per day: 5.5", lion.getMeatWeightInfo());
    }

    public void testMonkeyCreationAndGetters() {
        Monkey monkey = new Monkey("George", 20.0, "Mango");
        assertEquals("George", monkey.getName());
        assertEquals(20.0, monkey.getWeight(), 0.001);
        assertEquals("Favourite Food: Mango", monkey.getFavouriteFoodInfo());
    }

    public void testSnakeCreationAndGetters() {
        Snake snake = new Snake("Shisha", 10.0, 6.23);
        assertEquals("Shisha", snake.getName());
        assertEquals(10.0, snake.getWeight(), 0.001);
        assertEquals("Length: 6.23", snake.getLengthInfo());
    }

    public void testAddAndGetAnimals() {
        Zoo zoo = new Zoo();
        assertTrue(zoo.getAnimals().isEmpty());

        Lion lion1 = new Lion("Simba", 180.5, 5.5);
        Monkey monkey1 = new Monkey("Alex", 20.0, "Banana");
        Snake snake1 = new Snake("Lucifer", 10.0, 6.23);
        zoo.addAnimals(lion1);
        zoo.addAnimals(monkey1);
        zoo.addAnimals(snake1);

        List<Animal> animalList = zoo.getAnimals();

        assertEquals(3, animalList.size());
        assertEquals("Simba", animalList.get(0).getName());
        assertEquals("Alex", animalList.get(1).getName());
        assertEquals("Lucifer", animalList.get(2).getName());
    }

    public void testAddNullAnimal() {
        Zoo zoo = new Zoo();
        zoo.addAnimals(null);
        assertEquals(0, zoo.getAnimals().size());
    }

    public void testGetTotalWeight() {
        Zoo zoo = new Zoo();
        zoo.addAnimals(new Lion("Simba", 180.5, 5.5));
        zoo.addAnimals(new Monkey("Alex", 20.0, "Banana"));

        assertEquals(200.5, zoo.getTotalWeight(), 0.001);
    }
}
