package ru.ezhov.lessons.homework.ezhov.test.staticTest;

import java.util.ArrayList;
import java.util.List;

public class LojicTestMain {
    public static void main(String[] args) {
        System.out.println("from main");
        LojicTest lojicTest = new LojicTest();
        LojicTest lojicTest1 = new LojicTest();

        List<Integer> integerList = new ArrayList() {{
            add(1);
            add(2);
            add(3);
        }};
    }
}
