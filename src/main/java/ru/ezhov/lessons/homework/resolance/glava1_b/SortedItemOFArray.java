package ru.ezhov.lessons.homework.resolance.glava1_b;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortedItemOFArray {
    public void SortedItemOFArray(TreeSet inputArray) {
        System.out.println("Массив отсортирован: ");
    }


    public SortedItemOFArray(int[] inputArray) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer integer: inputArray) {
            treeSet.add(integer);
        }
        System.out.println(treeSet);
    }
}