package ru.ezhov.lessons.homework.Nickel;

/**
 * Created by Nickel on 16.08.2017.
 */
public class Suvorov {
    private static int nam;

    public Suvorov() {
        nam++;
    }

    public static int kol() {
        return nam;
    }

    public String doIt() {
        return "Использован Супер";
    }
}

