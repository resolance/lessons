package ru.ezhov.lessons.homework.resolance.glava5;

public class CheckConstructorChild extends CheckConstructorParrant{
    public CheckConstructorChild(){
        System.out.println("Констрктор Класса CheckConstructorChild");
    }
}

class CheckConstructorParrant{
    public CheckConstructorParrant(){
        System.out.println("Констрктор Класса CheckConstructorParrant");
    }
}

