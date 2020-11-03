package ru.mirea.Lab4;

public class Tree implements Nameable {
    private String name;

    Tree(String name) {
        this.name = name;
    }
    public void getName() {
        System.out.println("This tree is called " + this.name);
    }

}
