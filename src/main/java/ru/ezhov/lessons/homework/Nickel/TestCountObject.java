package ru.ezhov.lessons.homework.Nickel;

import java.util.Random;

public class TestCountObject {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Suvorov();
        }

        System.out.println(Suvorov.kol());
    }
}
