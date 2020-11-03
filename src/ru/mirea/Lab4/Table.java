package ru.mirea.Lab4;

public class Table implements Priceable {
    //fields
    private String name;
    private double price;

    //constructor
    Table(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Getter and setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName(String name) {
        return name;
    }

    @Override
    public void getPrice() {
        System.out.println("This table is called " + this.name + " and is price at " + this.price + " USD");
    }
}
