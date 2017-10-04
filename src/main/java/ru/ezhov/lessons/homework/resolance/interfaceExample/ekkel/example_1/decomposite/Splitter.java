package ru.ezhov.lessons.homework.resolance.interfaceExample.ekkel.example_1.decomposite;

import java.util.Arrays;

public class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" " ));
    }
}
