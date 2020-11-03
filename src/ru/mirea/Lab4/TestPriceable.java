package ru.mirea.Lab4;

public class TestPriceable {
    public static void main(String [] args) {
        Priceable p1 = new Chair("Sofa", 200 );
        p1.getPrice();

        Chair b1 = new Chair("Park bench", 560.6);
        b1.getPrice();

        p1 = new Table("Resolute", 650);
        p1.getPrice();


    }
}
