package ru.ezhov.lessons.homework.ezhov.test.staticTest;

public class StaticTest {
    public static void main(String[] args) {
        //StaticClass.TEST  //Вызвать не можем - приватная
        String s = StaticClass.TEST_ONE;
        System.out.println(s);

        StaticClass.test();
    }
}

