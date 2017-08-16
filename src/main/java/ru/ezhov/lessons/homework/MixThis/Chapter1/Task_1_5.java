package ru.ezhov.lessons.homework.MixThis.Chapter1;

import java.util.*;

public class Task_1_5 {

    public static void main(String[] args) {
        int arraySize = 0;

        System.out.println("Введите количество чмсел и нажмите <Enter>:");
        Scanner scanArray = new Scanner(System.in);

        try {
            arraySize = Integer.parseInt(scanArray.next());
        } catch (NumberFormatException e) {
            System.out.println("Введите корректное количество.");
            System.exit(0);
        }

        int[] arrayNumber = new int[arraySize];
        int sumArrayNumbers = 0;
        int multArrayNumbers = 1;
        int i = 0;

        try {
            for (int element : arrayNumber) {
                System.out.println("Введите " + (i + 1) + " число: ");
                arrayNumber[i] = scanArray.nextInt();
                sumArrayNumbers = sumArrayNumbers + arrayNumber[i];
                multArrayNumbers = multArrayNumbers * arrayNumber[i];
                i++;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введите корректные данные.");
            System.exit(0);
        }

        System.out.println("Сумма чисел: " + sumArrayNumbers);
        System.out.println("Произведение чисел: " + multArrayNumbers);

        scanArray.close();
    }

}
