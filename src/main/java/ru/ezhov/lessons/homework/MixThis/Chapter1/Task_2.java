package ru.ezhov.lessons.homework.MixThis.Chapter1;

import java.util.*;

public class Task_2 {

    public static void main(String[] args) {

        System.out.println("Введите количество чисел для ввода и нажмите <Enter>:");
        Scanner scanNumbers = new Scanner(System.in);

        int arraySize = 0;

        try {
            arraySize = Integer.parseInt(scanNumbers.next());
        } catch (NumberFormatException e) {
            System.out.println("Введите корректные данные.");
        }

        int[] arrayNumbers = new int[arraySize];

        try {
            for (int i = 0; i < arraySize; i++) {
                int n = i + 1;
                System.out.println("Введите " + n + " число и нажмите <Enter>:");
                arrayNumbers[i] = scanNumbers.nextInt();
            }
        } catch (NumberFormatException e) {
            System.out.println("Введите корректные данные.");
        }

        Task7Operations operations = new Task7Operations();

        //1) Четные и нечетные числа.
        operations.calculateEvenAndOddNumbers(arrayNumbers);

        //2) Наибольшее и наименьшее число.
        operations.calculateMinAndMaxNumbers(arrayNumbers);

        //3) Числа, которые делятся на 3 или на 9.
        operations.calculateMultiple3And9Numbers(arrayNumbers);

        //4) Числа, которые делятся на 5 и на 7.
        operations.calculateMultiple5And7Numbers(arrayNumbers);

        //5) Элементы, расположенные методом пузырька по убыванию модулей.
        operations.calculateBubbleSortingNumbers(arrayNumbers);

        //6) Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        operations.calculateThreeDifferentDigitNumbers(arrayNumbers);

        //7) Наибольший общий делитель и наименьшее общее кратное этих чисел.
        operations.calculateGreatestCommonDivisor(arrayNumbers);
        operations.calculateLeastCommonMultiple(arrayNumbers);

        //8) Простые числа.
        operations.calculateSimpleNumber(arrayNumbers);

        Integer[] arrayNumbersObj = new Integer[arrayNumbers.length];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbersObj[i] = arrayNumbers[i];
        }

        //9) Отсортированные числа в порядке возрастания и убывания.
        operations.sortNumbersByAscAndDesc(arrayNumbersObj);

        //10) Числа в порядке убывания частоты встречаемости чисел.
        operations.calculateNumbersFrequencyByDesc(arrayNumbersObj);

    }

}
