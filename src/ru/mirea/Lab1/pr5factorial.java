package ru.mirea.Lab1;

import java.util.Scanner;

public class pr5factorial {
    public static void main(String args[]) {

        System.out.println("---------FACTORIAL OF N----------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            fact *= i;
        }
        System.out.print("Factorial of " + n + ": " + fact);
        scanner.close();
    }
}
