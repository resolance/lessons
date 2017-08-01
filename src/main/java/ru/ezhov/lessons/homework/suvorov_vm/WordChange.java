package ru.ezhov.lessons.homework.suvorov_vm;

import java.util.Scanner;

public class WordChange {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        char[] strName = name.toCharArray();

        char firstSimbol = strName[0];
        char endSimbol = strName[strName.length - 1];
        String seredinaSlova ="";

        for(int i = strName.length - 2; i > 0; i--)
        {
            seredinaSlova = seredinaSlova + strName[i];
        }

        System.out.println(firstSimbol + seredinaSlova + endSimbol);
    }
}

