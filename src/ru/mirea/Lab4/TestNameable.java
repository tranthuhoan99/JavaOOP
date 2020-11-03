package ru.mirea.Lab4;

public class TestNameable {
    public static void main(String[] args){
        Nameable n1 = new Animal("Tigers");
        n1.getName();

        n1 = new Flower("Tulips");
        n1.getName();

        Tree t1 = new Tree("Maple");
        t1.getName();
    }
}
