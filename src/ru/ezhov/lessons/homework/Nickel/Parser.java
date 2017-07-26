package ru.ezhov.lessons.part01.chapter01.Nickel;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Реализовать приложение, которое будет гласные буквы делать заглавными, а согласные менять на номера их в алфавите и обратно.
    Реализовать приложение, которое будет преобразовывать введенный текст в строку без пробелов, и преобразовывать обратно

    Заметки:
        1. Реализация первой задачи
        2. Модульность (необходимо сделать работу приложения в разных методах)
 */

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> notSpaceList = new ArrayList<String>();
        ArrayList<String> spacekList = new ArrayList<String>();

        while (true) {
            System.out.println("Введите строку или Е для выхода");
            String strInput = scn.nextLine();

            if (strInput.toLowerCase().equals("e")) {
                System.out.println("Работа завершена");
                break;
            }

            if (strInput.contains(" ")) {
                System.out.println("Обработка");
                String strNew = strInput.replace(" ", "");
                System.out.println(strNew);

                if (spacekList.indexOf(strInput) == -1) {
                    spacekList.add(strInput);
                    notSpaceList.add(strNew);
                }
            } else {
                System.out.println("Поиск");
                ArrayList<String> resultList = new ArrayList<String>();
                for (int i = 0; i < notSpaceList.size(); i++) {
                    if (notSpaceList.get(i).equals(strInput)) {
                        resultList.add(spacekList.get(i));
                    }
                }

                if (resultList.isEmpty()) {
                    System.out.println("Результат: Строки не найдены");
                } else {
                    System.out.println("Результат:");
                    for (int i = 0; i < resultList.size(); i++) {
                        System.out.println(resultList.get(i));
                    }
                }
            }
            System.out.println("");
        }
    }
}
