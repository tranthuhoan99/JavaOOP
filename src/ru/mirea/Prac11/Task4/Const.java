package ru.mirea.Prac11.Task4;

public class Const implements TripleExpression {
    final int constant;

    public Const(int constant) {
        this.constant = constant;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return constant;
    }
}
