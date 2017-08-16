package ru.ezhov.lessons.homework.MixThis.Chapter1;

import java.util.*;

public class Task_1_2 {

    public static void main(String[] args) {
        System.out.println("Введите текст и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer(scan.next());
        buffer.reverse();
        System.out.println(buffer);
        scan.close();
    }

}
