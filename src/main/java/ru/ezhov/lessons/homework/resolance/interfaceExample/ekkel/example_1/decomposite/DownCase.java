package ru.ezhov.lessons.homework.resolance.interfaceExample.ekkel.example_1.decomposite;

public class DownCase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}
