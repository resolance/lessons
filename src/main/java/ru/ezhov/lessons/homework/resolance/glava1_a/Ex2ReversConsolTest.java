package ru.ezhov.lessons.homework.resolance.glava1_a;

import java.util.Arrays;

public class Ex2ReversConsolTest {
    public static void main(String[] args) {
        args = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};
        Ex2ReversConsol reversCon = new Ex2ReversConsol();
        System.out.println(Arrays.toString(reversCon.argFromConsol(args)));
    }
}
