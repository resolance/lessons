package ru.ezhov.lessons.homework.resolance.glava1_b;

public class MaxAndMinNumber {
    private int maxNumber;
    private int minNumber;

    private int getMaxNumber(int[] inputIntArray){
        maxNumber = inputIntArray[0];
        for (int i = 0; i < inputIntArray.length; i++) {
            if (maxNumber < inputIntArray[i]) {
                maxNumber = inputIntArray[i];
            }
        }
        return maxNumber;
    }

    private int getMinNumber(int[] inputIntArray){
        minNumber = inputIntArray[0];
        for (int i = 0; i < inputIntArray.length; i++) {
            if (minNumber > inputIntArray[i]) {
                minNumber = inputIntArray[i];
            }
        }
        return minNumber;
    }

    public void getMaxAndMin(int [] inputArray) {
        System.out.println("Максимальное число в данном массиве " + getMaxNumber(inputArray));
        System.out.println("Минимальное число в данном массиве " + getMinNumber(inputArray));
    }
}
