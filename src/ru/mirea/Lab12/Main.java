package ru.mirea.Lab12;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of exercise:");
        String number = scanner.nextLine();

        switch (number) {
            case "1":
                ex1(scanner);
                break;
            case "2":
                ex2(scanner);
                break;
            case "31":
                ex31(scanner);
                break;
            case "32":
                ex32(scanner);
                break;
            case "33":
                ex33(scanner);
                break;
            case "34":
                ex34(scanner);
                break;
            case "35":
                ex35(scanner);
                break;
            default:
                System.out.println("There isn't that exercise");
        }
    }

    static void ex1(Scanner scanner) {
        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        System.out.println("Enter the RegEx:");
        Pattern pattern = Pattern.compile(scanner.nextLine());
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(string.substring(matcher.start(), matcher.end()));
        }
    }

    static void ex2(Scanner scanner) {
        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher matcher = pattern.matcher(string);

        System.out.println(matcher.find() ? "YES" : "NO");
    }

    static void ex31(Scanner scanner) {
        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)?\\s(USD|RUB|EU))+");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(string.substring(matcher.start(), matcher.end()));
        }
    }

    static void ex32(Scanner scanner) {
        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d\\s?\\+");
        Matcher matcher = pattern.matcher(string);

        System.out.println(matcher.find() ? "YES" : "NO");
    }

    static void ex33(Scanner scanner) {
        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        Pattern pattern = Pattern.compile("(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)");
        Matcher matcher = pattern.matcher(string);

        System.out.println(matcher.find() ? "YES" : "NO");

    }

    static void ex34(Scanner scanner) {
        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[\\w!#$%&'*+/=?^`{|}~-]+@((\\w+(\\.\\w+)+)|localhost)$");
        Matcher matcher = pattern.matcher(string);

        System.out.println(matcher.find() ? "YES" : "NO");
    }

    static void ex35(Scanner scanner) {
        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(?=\\.{0,})(?=.*\\d+.*)(?=.*[A-Z]+.*)(?=.*[a-z]+.*).{8,}$");
        Matcher matcher = pattern.matcher(string);

        System.out.println(matcher.find() ? "YES" : "NO");
    }
}

