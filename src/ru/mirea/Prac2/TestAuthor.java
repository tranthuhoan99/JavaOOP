package ru.mirea.Prac2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Hana", "tranthuhoan06@gmail.com", 'H');
        System.out.println(author.toString());
        author.setEmail("tranthuhoan06@gmail.com");
        System.out.println(author.toString());
    }
}
