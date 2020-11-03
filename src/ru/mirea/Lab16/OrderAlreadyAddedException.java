package ru.mirea.Lab16;

class OrderAlreadyAddedException extends Exception {
    OrderAlreadyAddedException(){
        super("Another order already linked with this table/address.");
    }
}
