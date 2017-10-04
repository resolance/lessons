package ru.ezhov.lessons.homework.resolance.interfaceExample.ekkel.example_1.interfaceEx;

public abstract class StringProcessor implements Processor  {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

}
