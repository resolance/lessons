package ru.ezhov.lessons.homework.resolance.interfaceExample.ekkel.example_1.interfaceEx;

public class UpcaseInterf extends StringProcessor {

    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
