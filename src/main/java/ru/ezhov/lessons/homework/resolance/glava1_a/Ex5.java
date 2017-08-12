package ru.ezhov.lessons.homework.resolance.glava1_a;

import java.util.ArrayList;

public class Ex5 {

    private int[] checkInputArgs(String[] inputData) {
        ArrayList<Integer> filtredArray = new ArrayList<>();

        for (int i = 0; i < inputData.length; i++) {
            try {
                int step = Integer.parseInt(inputData[i]);
                filtredArray.add(step);
            } catch (NumberFormatException e) {
                i++;
            }
        }
        int[] sortedArrayInt = new int[filtredArray.size()];
        for (int i = 0; i < filtredArray.size(); i++) {
            sortedArrayInt[i] = filtredArray.get(i);
        }
        return sortedArrayInt;
    }


    public int resultSumm(String[] args) {
        int[] summ = checkInputArgs(args);
        int resultS = 0;
        for (int aSumm : summ) {
            resultS = resultS + aSumm;
        }
//        for (int i = 0; i < summ.length; i++) {
//            resultS = resultS + summ[i];
//        }
        return resultS;
    }

    public int resultMult(String[] args) {
        int[] summ = checkInputArgs(args);
        int resultM = 1;
        for (int i = 0; i < summ.length; i++) {
            resultM = resultM * summ[i];
        }
        return resultM;
    }

}
