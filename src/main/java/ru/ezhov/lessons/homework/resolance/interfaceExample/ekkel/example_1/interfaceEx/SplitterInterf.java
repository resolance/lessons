package ru.ezhov.lessons.homework.resolance.interfaceExample.ekkel.example_1.interfaceEx;

import java.util.Arrays;

public class SplitterInterf extends StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
