package ru.ezhov.lessons.homework.suvorov_vm.Glava1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Var1_3 {
    public static void main(String[] args) {
        System.out.println("Введите количество рандомных чисел");
        Scanner scan = new Scanner(System.in);
        String KolSymbolsRandom = scan.next();
        proverkaZnachenia(KolSymbolsRandom);
        System.out.println(itogZnachenie);
        }

    public static int proverkaZnachenia(String vvedennoeZnachenie)
    {
       int i = Integer.parseInt(vvedennoeZnachenie);

       try
       {
           randomer(i);
       }
       catch()
       {
           System.out.println("Вводить нужно только числа, без пробелов и других символов");
       }

    }

    public static String randomer(int i)
    {
        String itogZnachenie = "";
        int[] spisokRandomerov = new int[i];

       for(int a = spisokRandomerov.length - 1; a < spisokRandomerov[0]; a--)
       {
           spisokRandomerov[a] = (int)(Math.random() * 10);
           itogZnachenie = itogZnachenie + spisokRandomerov[a];
       }
        return itogZnachenie;
    }
}
