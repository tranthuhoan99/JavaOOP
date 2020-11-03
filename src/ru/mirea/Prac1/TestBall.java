package ru.mirea.Prac1;

public class TestBall {
    public static void main(String[] args) {
        Ball sw1 = new Ball("Tiento", 7);
        Ball sw2 = new Ball("Tango");
        Ball sw3 = new Ball(8);
        Ball sw4 = new Ball();
        sw3.setnameOwner("Uniforia");
        System.out.println(sw1);
        System.out.println(sw2);
        System.out.println(sw3);
        System.out.println(sw4);
    }
}
