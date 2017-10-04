package ru.ezhov.lessons.homework.resolance.interfaceExample.ekkel.example_1.decomposite;


public class Processor {
    public String name(){
        return getClass().getSimpleName();
    }
    Object process (Object input){
        return input;
    }
}
