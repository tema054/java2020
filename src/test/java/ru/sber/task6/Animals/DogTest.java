package ru.sber.task6.Animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void feedingTheDog() {
        {
            try {
                Dog dog = new Dog("bobic", 9, -5);
            } catch (Exception e) {
                assertNotEquals("", e.getMessage());
            }
        }
    }
    @Test
    void feedingTheDogNotVegetable() {
        {
            try {
                Dog dog = new Dog("bobic", 9, 5);
                dog.setEat(new Cat("varsik",11, 10));
            } catch (Exception e) {
                assertNotEquals("", e.getMessage());
            }
        }
    }

    @Test
    void feedingTheDogVegetable() {
        {
            try {
                Dog dog = new Dog("bobic", 9, 5);
                dog.setEat(new String());
            } catch (Exception e) {
                assertNotEquals("", e.getMessage());
            }
        }
    }
}