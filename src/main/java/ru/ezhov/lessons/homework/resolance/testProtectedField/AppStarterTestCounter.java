package ru.ezhov.lessons.homework.resolance.testProtectedField;


import ru.ezhov.lessons.homework.resolance.testProtectedField.counterImplements.LittleCounter;

public class AppStarterTestCounter {
    public static void main(String[] args) {
        ru.ezhov.lessons.homework.resolance.testProtectedField.counterImplements.LittleCounter littleCounter
                = new ru.ezhov.lessons.homework.resolance.testProtectedField.counterImplements.LittleCounter();
        littleCounter.counter();

        littleCounter = new LittleCounter() {
            {
                countIteration = 3;
            }
        };
        littleCounter.counter();
    }
}
