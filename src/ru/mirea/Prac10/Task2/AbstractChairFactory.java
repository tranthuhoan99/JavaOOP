package ru.mirea.Prac10.Task2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicChair();
    public FunctionalChair createFunctionalChair();
}
