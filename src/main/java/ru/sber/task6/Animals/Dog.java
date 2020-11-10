package ru.sber.task6.Animals;


import ru.sber.task6.Animals.exception.EatException;
import ru.sber.task6.Animals.exception.SizeException;

public class Dog extends Animals {
    private String sound = "I\'m an Dog";
    private Object eat;
    private final boolean climbTrees = false;

    public Dog(String name,  int moveSpeed , int size) throws SizeException {
        super(name, moveSpeed, size);
        super.setClimbTrees(false);
    }


    public Dog(String name, int moveSpeed, int size ,Object eat) throws EatException, SizeException {
        super(name, moveSpeed,size);
        if (eat instanceof Animals ) {
            this.eat = eat;
        } else
        {
            throw new EatException("I can't eat it!");
        }
    }
    @Override
    public void setEat(Object eat) throws EatException {
        if (eat instanceof Animals ) {
            this.eat = eat;
        } else
        {
            throw new EatException("I can't eat it!");
        }
    }


}
