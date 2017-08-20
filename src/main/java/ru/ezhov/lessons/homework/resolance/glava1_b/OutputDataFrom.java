package ru.ezhov.lessons.homework.resolance.glava1_b;

import java.util.ArrayList;
/**
 * блок вывода четных и не четных значений массива
 */
public class OutputDataFrom {
    public final void outputChetnieNumber(int[] inputFromConsol){

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < inputFromConsol.length; i++){
            if (new ChetnieNumbers().ifIsNumberChet(inputFromConsol[i]) == true){
                System.out.println("Число четное " + inputFromConsol[i]);
                list.add(String.valueOf(inputFromConsol[i]));
            }
        }
    }
    public final void outputNeChetnieNumber(int[] inputFromConsol){

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < inputFromConsol.length; i++){
            if (new NeChetnieNumbers().ifIsNumberChet(inputFromConsol[i]) == true){
                System.out.println("Число не четное " + inputFromConsol[i]);
                list.add(String.valueOf(inputFromConsol[i]));
            }
        }
    }
}
