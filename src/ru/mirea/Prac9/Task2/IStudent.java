package ru.mirea.Prac9.Task2;

public interface IStudent {
    void quickSort(Student[] arr, int left, int right);
    Student search(Student[] arr, String name) throws StudentNotFoundException;
}
