package ru.ezhov.lessons.homework.suvorov_vm.Glava1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Var1_2 {
    public static void main(String[] args) {
        System.out.println("Введите значение строки, которое нужно написать в обратном порядке");
        Scanner scan = new Scanner(System.in);
        String slovo = scan.next();
        String s =  breakSumbols(slovo);
        System.out.println(s);

    }

    public static String breakSumbols(String slovo) {
        char[] chSlovo = slovo.toCharArray();
        return coup(chSlovo);
    }


    public static String coup (char[] sumbols)
    {
        String obratnoeSlovo = "";
        for(int i = sumbols.length-1; i>sumbols[0]; i--)
        {
            obratnoeSlovo = obratnoeSlovo + sumbols[i];
        }
        return obratnoeSlovo;
    }
}
