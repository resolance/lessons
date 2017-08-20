package ru.ezhov.lessons.homework.resolance.glava1_b;

import java.util.ArrayList;
/**
 * DevisionBy3Or9 выводит информацию
 * делится ли число на 3 или на 9
 *
 * */
public class DevisionBy3Or9 {
    private ArrayList<Integer> DevisionBy(int [] inputArray){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if ((inputArray[i]%3 == 0) | inputArray[i]%9 ==0) {
                list.add(inputArray[i]);
            }
        }
        return list;
    }

    public void getChekedItemByDevision3Or9(int[] inputArray){
        System.out.println("Массив чисел, которые делятся на 3 или 9 " + DevisionBy(inputArray));
    }

    /**
     * DevisionByDetail выводит подробную информацию
     * делится ли число на 3 и делиться ли число на 9
     *
     */

    /*private ArrayList<Integer> DevisionByDetail(int [] inputArray){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if ((inputArray[i]%3 == 0) | inputArray[i]%9 ==0) {
                list.add(inputArray[i]);
            }
        }
        return list;
    }*/
}
