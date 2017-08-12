package ru.ezhov.lessons.homework.resolance.glava1_a;

public class Ex1Test {
    public static void main(String[] args) {
        Ex1 printNameFromKeyboard = new Ex1().PrintName(new InputFromConsol().readUserInput());
        Ex1 printName = new Ex1().PrintName("Костянчик, дорогой");
    }
}
