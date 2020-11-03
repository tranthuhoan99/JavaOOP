package ru.mirea.Lab1;

import java.util.Random;
import java.util.Scanner;

public class pr4randomArray {
    public Integer[] intArray;
    // creat array
    public static Integer[] creatArray(Random random, Integer temp){
        Integer[] intArray = new Integer[temp];
        for(int i = 0; i<temp;i++){
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }

    // show array
    public static void showArray(Integer[] intArray){
        System.out.print("Array: ");
        for(int i=0;i< intArray.length;i++){
            System.out.print(" " + intArray[i]);
        }
    }

    // sort array (insertion sort)
    public static void sortArray(Integer[] intArray){
        insertionSort(intArray);
    }

    public static void insertionSort(Integer[] intArray)
    {
        int i, key, j;
        int n = intArray.length;
        for (i = 1; i < n; i++)
        {
            key = intArray[i];
            j = i-1;

            while (j >= 0 && intArray[j] > key)
            {
                intArray[j+1] = intArray[j];
                j = j-1;
            }
            intArray[j+1] = key;
        }
    }

    public static void main(String arg[]){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements: ");
        Integer temp = scanner.nextInt();
        scanner.close();

        // creat array
        Integer[] array = creatArray(random,temp);
        // show array before sort
        showArray(array);
        // sort
        System.out.println();
        sortArray(array);
        // show array before sort
        showArray(array);
    }
}
