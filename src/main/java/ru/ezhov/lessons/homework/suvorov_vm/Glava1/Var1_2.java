package ru.ezhov.lessons.homework.suvorov_vm.Glava1;

import java.util.Scanner;

public class Var1_2 {
    public static void main(String[] args) {
        System.out.println("Введите значение строки, которое нужно написать в обратном порядке");
        Scanner scan = new Scanner(System.in);
        String slovo = scan.next();
        breakSumbols(slovo);

    }

    public static void breakSumbols(String slovo)
    {
        char[] ChSlovo = slovo.toCharArray();
        ChSlovo.coup();
    }

    public String coup (char[] sumbols)
    {
        String obratnoeSlovo = "";
        for(int i = sumbols.length-1; i>sumbols[0]; i--)
        {
            obratnoeSlovo = obratnoeSlovo + sumbols[i];
        }
        return obratnoeSlovo;
    }
}
