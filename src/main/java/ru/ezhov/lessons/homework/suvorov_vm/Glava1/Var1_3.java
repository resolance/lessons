package ru.ezhov.lessons.homework.suvorov_vm.Glava1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Var1_3 {
    public static void main(String[] args) {
        System.out.println("Введите количество рандомных чисел");
        Scanner scan = new Scanner(System.in);
        String kolSymbolsRandom = scan.next();
        String result = proverkaZnacheniaAndRandomer(kolSymbolsRandom);
        System.out.println(result);
    }

    public static String proverkaZnacheniaAndRandomer(String vvedennoeZnachenie) {

        try {
            int val = Integer.parseInt(vvedennoeZnachenie);
            return randomer(val);
        } catch (Exception e) {
            System.out.println("Вводить нужно только числа, без пробелов и других символов");
            return "fuck";
        }
    }

    public static String randomer(int i) {
        String itogZnachenie = "";
        int[] spisokRandomerov = new int[i];

        for (int a = spisokRandomerov.length - 1; a < 0; a--) {
            spisokRandomerov[a] = (int) (Math.random() * 10);
            itogZnachenie = itogZnachenie + spisokRandomerov[a];
        }
        return itogZnachenie;
    }
}
