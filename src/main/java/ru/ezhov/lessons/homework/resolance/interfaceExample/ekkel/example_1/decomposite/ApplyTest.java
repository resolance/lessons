package ru.ezhov.lessons.homework.resolance.interfaceExample.ekkel.example_1.decomposite;

public class ApplyTest {
    public static void main(String[] args) {
        final String s = "Текст для проверки работоспособности ковариантных классов ";
        Apply.process(new UpCase(),s);
        Apply.process(new DownCase(),s);
        Apply.process(new Splitter(),s);
    }
}
