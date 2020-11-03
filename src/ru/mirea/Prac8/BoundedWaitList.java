package ru.mirea.Prac8;

public class BoundedWaitList<E> extends WaitList<E> {


    private int capacity;


    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if(content.size() < capacity) {
            super.add(element);
        }
        else
            throw new RuntimeException("Not enough capacity for adding new item");
    }


    @Override
    public String toString() {
        return super.toString() + " Capacity = " + getCapacity();
    }
}
