package ru.mirea.Prac1;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 140);
        Book book2 = new Book("Physiologist", 200);
        Book book3 = new Book(345);
        Book book4 = new Book("Synopsis");
        book4.getInformationOfBook();
        book3.getInformationOfBook();
        book2.getInformationOfBook();
        book1.getInformationOfBook();
    }
}
