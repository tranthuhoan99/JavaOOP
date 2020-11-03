package ru.mirea.Prac10.Task2;

public class TestChair {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Client client = new Client();

        VictorianChair victorianChair = chairFactory.createVictorianChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();
        MagicChair magicChair = chairFactory.createMagicChair();

        client.setChair(functionalChair);
        client.sit();

        client.setChair(victorianChair);
        client.sit();

        client.setChair(magicChair);
        client.sit();
    }
}
