package ru.mirea.Prac1;

public class Book {
    // fields
    private String name;
    private int pages;

    // constructors
    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
    public Book(String name) {
        this.name = name;
        this.pages = 420;
    }
    public Book(int pages) {
        this.name = "Zadonschina";
        this.pages = pages;
    }

    //getter and setter
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getPages() {
        return pages;
    }
    public void getInformationOfBook() {
        System.out.println(getName()+" has " + getPages()+" pages. ");
    }
}
