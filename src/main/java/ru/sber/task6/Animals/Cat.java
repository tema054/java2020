package ru.sber.task6.Animals;

import ru.sber.task6.Animals.exception.EatException;
import ru.sber.task6.Animals.exception.SizeException;

public class Cat extends Animals{
    private  String sound =  "I\'m an Cat";
    private final boolean climbTrees = true;


    public Cat(String name,  int moveSpeed ,  int size ) throws SizeException {
        super(name, moveSpeed, size);
    }

    @Override
    public void setEat(Object eat) throws EatException {
        if (eat instanceof Animals ) {
            if (((Animals) eat).getSize() >= getSize())
            {
                throw new EatException("I can't eat it! Animals to large");
            }
            else {
                super.setEat(eat);
            }
            super.setEat(eat);
        } else
        {
            throw new EatException("I can't eat it!");
        }
    }
}

