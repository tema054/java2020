package ru.sber.task6.Animals;
import ru.sber.task6.Animals.exception.*;

public abstract class Animals  {
/*Необходимо построить модель поведения кошек и собак (Написать соответствующие классы).
 Модель должна отражать возможности этих животных издавать звуки, двигаться кушать, лазать по деревьям и плавать (поля + методы).
 Модель должна учитывать возможность расширения под новое животное по таким же критериям.*/
    private String name;
    private String sound;

    public void setEat(Object eat) throws EatException {
        this.eat = eat;
    }

    private Object eat ;
    private int moveSpeed;
    private boolean climbTrees;
    private boolean swim;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Animals(String name, int moveSpeed, int size) throws SizeException {
        this.name = name;
        this.moveSpeed = moveSpeed;
        if (size <= 0){
            throw new SizeException("the size must be > 0!!");
        }
    }


    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public void setClimbTrees(boolean climbTrees) {
        this.climbTrees = climbTrees;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public Object getEat() {
        return eat;
    }

    public boolean getClimbTrees() {
        return climbTrees;
    }

    public boolean getSwim() {
        return swim;
    }
}
