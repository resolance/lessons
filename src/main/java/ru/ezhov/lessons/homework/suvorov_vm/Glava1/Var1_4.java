package ru.ezhov.lessons.homework.suvorov_vm.Glava1;

import java.util.Scanner;

public class Var1_4 {
    public static void main(String[] args) {
        System.out.println("Введите пароль");
        Scanner scan = new Scanner(System.in);
        String pass = scan.next();
        String rootPass = "root";

        authorization(pass, rootPass);

    }

    private static void authorization(String pass, String rootPass)
    {
        if (pass.equals(rootPass))
        {
            System.out.println("Пароли верны, вход в систему");
        }
        else
        {
            System.out.println("Не верный пароль");
        }

    }
}
