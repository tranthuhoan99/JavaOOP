package ru.mirea.Lab3;

public class Fork extends Furniture {
    private boolean isBroken;

    protected Fork(int price, String color, int length) {
        super(price, color, length);
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    @Override
    public void toTrow() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Table{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", length=" + length +
                '}';
    }
}
