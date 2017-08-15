package ru.ezhov.lessons.homework.MixThis.Chapter1;

import java.util.*;
import static java.util.Collections.*;
import java.util.Map.*;

public class Task_2_Operations {

    public void calculateEvenAndOddNumbers(int[] arrayNumbers) {
        String arrayEvenNumbers = new String();
        String arrayOddNumbers = new String();

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 == 0) {
                arrayEvenNumbers = arrayEvenNumbers + " " + String.valueOf(arrayNumbers[i]);
            } else {
                arrayOddNumbers = arrayOddNumbers + " " + String.valueOf(arrayNumbers[i]);
            }
        }

        System.out.println("Четные числа:" + arrayEvenNumbers);
        System.out.println("Нечетные числа:" + arrayOddNumbers);
    }

    public void calculateMinAndMaxNumbers(int[] arrayNumbers) {
        int maxNumber = arrayNumbers[0];
        int minNumber = arrayNumbers[0];

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maxNumber) {
                maxNumber = arrayNumbers[i];
            }

            if (arrayNumbers[i] < minNumber) {
                minNumber = arrayNumbers[i];
            }
        }

        System.out.println("Максимальное число: " + maxNumber);
        System.out.println("Минимальное число: " + minNumber);
    }

    public void calculateMultiple3And9Numbers(int[] arrayNumbers) {
        String arrayTaskNumbers9 = new String();
        String arrayTaskNumbers3 = new String();

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 9 == 0) {
                arrayTaskNumbers9 = arrayTaskNumbers9 + " " + String.valueOf(arrayNumbers[i]);
                arrayTaskNumbers3 = arrayTaskNumbers3 + " " + String.valueOf(arrayNumbers[i]);
            } else if (arrayNumbers[i] % 3 == 0) {
                arrayTaskNumbers3 = arrayTaskNumbers3 + " " + String.valueOf(arrayNumbers[i]);
            }
        }

        System.out.println("Числа, которые делятся на 3:" + arrayTaskNumbers3);
        System.out.println("Числа, которые делятся на 9:" + arrayTaskNumbers9);
    }

    public void calculateMultiple5And7Numbers(int[] arrayNumbers) {
        String arrayTaskNumbers5 = new String();
        String arrayTaskNumbers7 = new String();

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 5 == 0) {
                arrayTaskNumbers5 = arrayTaskNumbers5 + " " + String.valueOf(arrayNumbers[i]);
            }
            if (arrayNumbers[i] % 7 == 0) {
                arrayTaskNumbers7 = arrayTaskNumbers7 + " " + String.valueOf(arrayNumbers[i]);
            }
        }

        System.out.println("Числа, которые делятся на 5:" + arrayTaskNumbers5);
        System.out.println("Числа, которые делятся на 7:" + arrayTaskNumbers7);
    }

    public void calculateBubbleSortingNumbers(int[] arrayNumbers) {
        System.out.println("Массив перед сортировкой: " + Arrays.toString(arrayNumbers));

        boolean flag = true;
        int numberTemp;

        while (flag = true) {
            flag = false;
            for (int i = 0; i < arrayNumbers.length - 1; i++) {
                if (arrayNumbers[i] < arrayNumbers[i + 1]) {
                    numberTemp = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[i + 1];
                    arrayNumbers[i + 1] = numberTemp;
                    flag = true;
                }
            }
        }

        System.out.println("Массив после сортировки: " + Arrays.toString(arrayNumbers));
    }

    public void calculateThreeDifferentDigitNumbers(int[] arrayNumbers) {
        String arrayNumber = new String();
        String arrayThreeDigits = new String();

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumber = String.valueOf(arrayNumbers[i]);
            if (arrayNumber.length() == 3
                    && arrayNumber.charAt(0) != arrayNumber.charAt(1)
                    && arrayNumber.charAt(1) != arrayNumber.charAt(2)
                    && arrayNumber.charAt(0) != arrayNumber.charAt(2)) {
                arrayThreeDigits = arrayThreeDigits + " " + String.valueOf(arrayNumbers[i]);
            }
        }

        System.out.println("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр:" + arrayThreeDigits);
    }

    private int calculateGreatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int x = b;
            b = a % b;
            a = x;
        }
        return a;
    }

    public void calculateGreatestCommonDivisor(int[] arrayNumbers) {
        int nod = arrayNumbers[0];
        for (int i = 1; i < arrayNumbers.length; i++) {
            nod = calculateGreatestCommonDivisor(nod, arrayNumbers[i]);
        }
        System.out.println("Наибольший общий делитель: " + nod);
    }

    private int calculateLeastCommonMultiple(int a, int b) {
        return a * (b / calculateGreatestCommonDivisor(a, b));
    }

    public void calculateLeastCommonMultiple(int[] arrayNumbers) {
        int nok = arrayNumbers[0];
        for (int i = 1; i < arrayNumbers.length; i++) {
            nok = calculateLeastCommonMultiple(nok, arrayNumbers[i]);
        }
        System.out.println("Наименьшее общее кратное: " + nok);
    }

    private int isSimpleNumber(int arrayNumber) {
        if (arrayNumber == 1) {
            return 0;
        }
        for (int i = 2; i * i <= arrayNumber; i++) {
            if (arrayNumber % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public void calculateSimpleNumber(int[] arrayNumbers) {
        String arraySimpleNumbers = new String();

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (isSimpleNumber(arrayNumbers[i]) == 1) {
                arraySimpleNumbers = arraySimpleNumbers + " " + String.valueOf(arrayNumbers[i]);
            }
        }

        System.out.println("Простые числа:" + arraySimpleNumbers);
    }

    public void sortNumbersByAscAndDesc(Integer[] arrayNumbersObj) {

        List<Integer> arrayNumbersList = Arrays.asList(arrayNumbersObj.clone());

        sort(arrayNumbersList);
        System.out.println("Сортировка по возрастанию: " + arrayNumbersList);

        reverse(arrayNumbersList);
        System.out.println("Сортировка по убыванию: " + arrayNumbersList);
    }

    private Map<Integer, Integer> sortNumbersWithDescByValue(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> frequencyList = new LinkedList<>(map.entrySet());

        sort(frequencyList, new Comparator<Object>() {

            public int compare(Object o1, Object o2) {
                return ((Entry<Integer, Integer>) (o2)).getValue().compareTo(
                        ((Map.Entry<Integer, Integer>) (o1)).getValue());
            }

        });

        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (Entry<Integer, Integer> frequency : frequencyList) {
            result.put(frequency.getKey(), frequency.getValue());
        }

        return result;
    }

    public void calculateNumbersFrequencyByDesc(Integer[] arrayNumbersObj) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (Integer arrayNumber : arrayNumbersObj) {
            map.put(arrayNumber, frequency(Arrays.asList(arrayNumbersObj), arrayNumber));
        }

        System.out.println("Частота встречаемости чисел в порядке убывания: "
                + sortNumbersWithDescByValue(map));
    }

}
