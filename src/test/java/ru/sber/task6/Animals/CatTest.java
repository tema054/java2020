package ru.sber.task6.Animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void feedingTheCat() {
        try{
            Cat cat = new Cat("varsik",11, 10);
            cat.setEat(new Cat("varsik_2",9,20));
        }  catch (Exception e){
            assertNotEquals("",e.getMessage());
        }
    }
}