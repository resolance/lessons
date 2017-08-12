package ru.ezhov.lessons.homework.resolance.glava1_a;
/**
 * Этот класс считеывает данные их консоли и возвращает массив строк
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromConsol {
    public String readUserInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = null;
        try {
            userInput = br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.print(e);
        }
        return userInput;
    }
}
