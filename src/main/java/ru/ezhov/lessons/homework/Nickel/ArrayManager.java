package ru.ezhov.lessons.homework.Nickel;

import java.util.ArrayList;

/**
 * Created by Nickel on 09.08.2017.
 */
public class ArrayManager {

    private ArrayList<Integer> arr;
    public int max;
    public int min;

    public ArrayManager(ArrayList<Integer> arr){
        this.arr = arr;
    }

    public Boolean calculateMinMax(){
        if (arr == null)
            return false;

        if (arr.size() == 0)
            return false;

        max = arr.get(0);
        min = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max)
                max = arr.get(i);

            if (arr.get(i) < min)
                min = arr.get(i);
        }

        return true;
    }
}
