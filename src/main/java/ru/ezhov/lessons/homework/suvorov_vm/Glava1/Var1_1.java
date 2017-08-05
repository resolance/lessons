package ru.ezhov.lessons.homework.suvorov_vm.Glava1;

import java.util.Scanner;

public class Var1_1 {
    public static void main(String[] args) {
        System.out.println("Введите свое имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        privetstvie(name);
    }

    public static void privetstvie(String name)
    {
        System.out.println("Привет " + name);
    }


}
