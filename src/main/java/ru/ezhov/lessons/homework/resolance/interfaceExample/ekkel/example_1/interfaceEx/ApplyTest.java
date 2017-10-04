package ru.ezhov.lessons.homework.resolance.interfaceExample.ekkel.example_1.interfaceEx;

public class ApplyTest {
    public static String s = "текст для проверки работоспособности ковариантных классов ";

    public static void main(String[] args) {
        Apply.process(new UpcaseInterf(),s);
        Apply.process(new DowncaseInterf(),s);
        Apply.process(new SplitterInterf(),s);
    }
}
