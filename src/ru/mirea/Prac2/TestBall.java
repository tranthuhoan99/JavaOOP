package ru.mirea.Prac2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball( 100, 100);
        System.out.println(ball1);
        ball1.moved(30, 15);
        System.out.println(ball1);
    }
}
