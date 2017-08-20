package ru.ezhov.lessons.homework.ezhov.test.forTest;

import java.util.Random;

public class ForTest {
    public static void main(String[] args) {
        int i = 10;
        for (; i < 10; i++) {
        }

        int a = 3;
        for (; ; ) {
            int r = getRandom();
            System.out.println(r);
            if (a == r) break;
        }
        System.out.println("out from for");

        for (int r = 0, j = 0; r < 10 && j < 7; i++, j += 5) {

        }
        for (int r = 0, j = 0; "text" == "text"; i++, j += 5) {

        }

    }


    private static int getRandom() {
        return new Random().nextInt(5);
    }
}
