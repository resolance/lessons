package ru.ezhov.lessons.homework.suvorov_vm.Glava1;

import java.util.Scanner;

public class Var1_5ConsoleReader {
    public String readFromConsole() {
        System.out.println("Введите целые числа через пробел");
        try (Scanner scan = new Scanner(System.in);) {
            return scan.nextLine();
        }
    }
}
