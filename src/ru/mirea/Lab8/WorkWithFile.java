package ru.mirea.Lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFile {
    public static void main(String[] args) {
        // writing to the file, information entered from the keyboard
        try (FileWriter writer = new FileWriter("C:\\Users\\79805\\IdeaProjects\\JavaOOP\\src\\ru\\mirea\\Lab8\\test.txt", false)) {
            Scanner sc = new Scanner(System.in);
            String txt = sc.nextLine();
            writer.write(txt);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // output information from the file to the screen
        try (FileReader reader = new FileReader("C:\\Users\\79805\\IdeaProjects\\JavaOOP\\src\\ru\\mirea\\Lab8\\test.txt")) {
            int c;
            while((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
