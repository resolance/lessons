package ru.ezhov.lessons.homework.MixThis.Chapter1;

import java.util.*;

public class Task_1_1 {

    public static void main(String[] args) {
        System.out.println("Введите Ваше имя и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
        scan.close();
    }

}
