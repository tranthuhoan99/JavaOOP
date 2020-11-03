package ru.mirea.Lab1;

import java.util.Scanner;

public class pr123loop {

    // prak1
    public static Integer[] creatArray(){
        System.out.println("---------CREATE OF ARRAY----------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int temp= scanner.nextInt();
        scanner.nextLine();
        Integer[] intArray = new Integer[temp];
        System.out.print("Value of elements: ");
        for(int i=0; i<temp;i++){
            intArray[i]= scanner.nextInt();
        }
        scanner.nextLine();
        scanner.close();
        System.out.println("---------CREATE OF ARRAY SUCCESSFYLLY----------");
        return intArray;
    }

    public static void sumOfArrayByFor(Integer[] intArray){
        System.out.println("---------SUM OF ARRAY BY FOR----------");
        int sum = 0;
        for(int i=0; i<intArray.length;i++){
            sum+=intArray[i];
        }
        System.out.println("Sum of array by for: " + sum);
    }

    public static void sumOfArrayByWhile(Integer[] intArray){
        System.out.println("---------SUM OF ARRAY BY WHILE----------");
        int sum = 0;
        int i=0;
        while(i<intArray.length){
            sum+=intArray[i];
            i++;
        }
        System.out.println("Sum of array by while: " + sum);
    }

    public static void sumOfArrayByDoWhile(Integer[] intArray){
        System.out.println("---------SUM OF ARRAY BY DO - WHILE----------");
        int sum = 0;
        int i=0;
        do{
            sum+=intArray[i];
            i++;
        }while(i<intArray.length);
        System.out.println("Sum of array by Do-While: " + sum);
    }

    // prak3
    public static void showElementOfSP(){
        System.out.println("---------------SP ARRAY----------------");
        for(int i=1; i<11;i++){
            System.out.println(i + "'st element: 1/" + i);
        }
    }

    public static void main(String args[]){
        // prak1
        Integer[] intArray = creatArray();
        sumOfArrayByFor(intArray);
        sumOfArrayByWhile(intArray);
        sumOfArrayByDoWhile(intArray);

        // prak2
        System.out.println(args);

        // prak3
        showElementOfSP();

    }
}
