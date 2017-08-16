package ru.ezhov.lessons.homework.Nickel;

/**
 * Created by Nickel on 16.08.2017.
 */
public class NumOfCreateObj {
    public static int num = 0;

    public NumOfCreateObj(int i) {
        num++;
        System.out.println("Класс NumOfCreateObj");
    }

    public String doIt() {
        return "Использован Супер";
    }
}
