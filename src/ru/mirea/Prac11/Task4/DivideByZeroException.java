package ru.mirea.Prac11.Task4;

public class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("division by zero");
    }
}
