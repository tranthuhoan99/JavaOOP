package ru.mirea.Lab4;

public class Flower implements Nameable {
    private String name;

    Flower(String name) {
        this.name = name;
    }
    public void getName() {
        System.out.println("This flower is called " + this.name);
    }
}
