package ru.ezhov.lessons.homework.resolance.glava1_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromConsol {
     public String inputFromConsol(){
        BufferedReader bufferesReader = new BufferedReader(new InputStreamReader(System.in));
        String dataFromConsol = null;
        try {
            dataFromConsol = bufferesReader.readLine();
            bufferesReader.close();

        }catch (IOException e) {
            System.out.println("Введено недопустимое значение" + e);
        }
        return dataFromConsol;
    }
}
