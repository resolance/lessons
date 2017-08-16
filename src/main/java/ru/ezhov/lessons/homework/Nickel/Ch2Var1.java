package ru.ezhov.lessons.homework.Nickel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nickel on 09.08.2017.
 */
public class Ch2Var1 {


    public static void main(String[] args) {

        TestForNumOfCreate test = new TestForNumOfCreate();
        TestForNumOfCreate test2 = new TestForNumOfCreate();
        Super s = new Super();
        if (true)
            return;

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число элементов: ");
        int size = scn.nextInt();

        ArrayList<Integer> numList = new ArrayList<Integer>();
        System.out.println("Заполните массив");
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + " элемент:");
            numList.add(scn.nextInt());
        }

        ArrayManager arrManager = new ArrayManager(numList);


        if (arrManager.calculateMinMax()) {
            System.out.println("Мин " + arrManager.min);
            System.out.println("Макс " + arrManager.max);
        } else
            System.out.println("Ошибка");
    }
}
