package ru.ezhov.lessons.homework.Nickel;

import jdk.nashorn.internal.runtime.NumberToString;

/**
 * Created by Nickel on 16.08.2017.
 */
public class TestForNumOfCreate {
    public int i;

    public TestForNumOfCreate() {
        NumOfCreateObj n = new NumOfCreateObj(2);
        i = NumOfCreateObj.num;
        System.out.println("Количество объектов = " + i);
    }


}
