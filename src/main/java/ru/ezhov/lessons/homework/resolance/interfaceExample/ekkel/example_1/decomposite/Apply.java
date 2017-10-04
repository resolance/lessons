package ru.ezhov.lessons.homework.resolance.interfaceExample.ekkel.example_1.decomposite;

public class Apply {
    public static void process(Processor p, Object stringS){
        System.out.println("Используем Processor " + p.name());
        System.out.println(p.process(stringS));
    }

}
