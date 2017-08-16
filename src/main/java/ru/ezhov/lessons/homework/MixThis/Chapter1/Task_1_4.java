package ru.ezhov.lessons.homework.MixThis.Chapter1;

import java.util.*;

public class Task_1_4 {

    public static void main(String[] args) {
        System.out.println("Введите пароль для сравнения и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String passwordEnter = scan.next();
        String passwordConst = "Password";

        if (passwordEnter.equals(passwordConst)) {
            System.out.println("Пароли совпадают.");
        }
        else {
            System.out.println("Пароли не совпадают.");
        }

        scan.close();
    }

}
