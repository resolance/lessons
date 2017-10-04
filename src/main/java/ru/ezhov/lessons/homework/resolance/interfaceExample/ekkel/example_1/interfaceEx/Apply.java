package ru.ezhov.lessons.homework.resolance.interfaceExample.ekkel.example_1.interfaceEx;

public class Apply {
    public static void process (Processor p, Object str){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(str));
    }
}
