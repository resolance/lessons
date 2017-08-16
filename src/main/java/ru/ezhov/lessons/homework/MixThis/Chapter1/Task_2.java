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

        //11) «Счастливые» числа.
        operations.calculateHappyNumbers(arrayNumbersObj);

        //12) Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).
        operations.calculateFibonacciNumbers(arrayNumbersObj);

        //13) Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
        operations.calculatePalindromNumbers(arrayNumbersObj);

        //14) Элементы, которые равны полусумме соседних элементов.
        operations.calculateNumbersHalfSumNeighbors(arrayNumbersObj);

        //15) Период десятичной дроби p = m/n для первых двух целых положительных чисел n и m, расположенных подряд.
        //В работе

        //16) Построить треугольник Паскаля для первого положительного числа.
        operations.calculatePascalTriangleForFirstPositiveNumber(arrayNumbersObj);

    }

}
