package ru.ezhov.lessons.homework.ezhov.test.staticTest;

public class LojicTest {

    static {
        System.out.println("static");
    }

    {
        System.out.println("first");
    }

    {
        System.out.println("second");
    }

    public LojicTest() {
        System.out.println("constructor");

    }
}
