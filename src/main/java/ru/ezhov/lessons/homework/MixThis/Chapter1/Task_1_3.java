package ru.ezhov.lessons.homework.MixThis.Chapter1;

import java.util.*;

public class Task_1_3 {

    public static void main(String[] args) {
        int amount = 0;

        System.out.println("Введите число цифр и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);

        try {
            amount = Integer.parseInt(scan.next());
        } catch (NumberFormatException e) {
            System.out.println("Введите корректное число.");
            System.exit(0);
        }

        for (int i = 1; i <= amount; i++) {
            Random r = new Random();
            int number = r.nextInt(100);
            System.out.println(i + "-ое случайное число: " + number + " ");
            System.out.print(i + "-ое случайное число: " + number + " ");
        }
        scan.close();
    }

}
