package ru.ezhov.lessons.homework.resolance.glava1_a;

import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    private int[] getDataRandomInt(int numVariable) {
        int[] dataArray = new int[numVariable];
        Random random = new Random();
        for (int i = 0; i < numVariable; i++) {
            dataArray[i] = random.nextInt(1000);
        }
        return dataArray;
    }

    public void printArray(int numVariable) {
        System.out.print(Arrays.toString(getDataRandomInt(numVariable)));
        System.out.println();
    }

    public void printArrayNewLine(int numVariable) {
        int[] nArray = getDataRandomInt(numVariable);
        int length = nArray.length;
        /*for (int i = 0; i < length; i++) {
            System.out.println(nArray[i]);
        }*/
        for (int aNArray : nArray) {
            System.out.println(aNArray);
        }
    }
}