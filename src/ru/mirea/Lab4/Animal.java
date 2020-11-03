package ru.mirea.Lab4;

public class Animal implements Nameable {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public void  getName() {
        System.out.println("This animal is called " + this.name);
    }

}
