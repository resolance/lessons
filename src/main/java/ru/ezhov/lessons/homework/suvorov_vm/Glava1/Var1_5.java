package ru.ezhov.lessons.homework.suvorov_vm.Glava1;

import java.util.Scanner;


//1. Сделать возможным тестирование
//2. Вспомогательный метод не private
//3.

public class Var1_5 {

    public int calculateS(String val, String separator) {
        try {
            return sumArray(preparedCalc(val, separator));
        } catch (Exception e) {
            NumberFormatException exception =
                    new NumberFormatException("Исключение при передаче параметра в массив список значений");
            exception.addSuppressed(e);
            throw exception;
        }
    }

    public int calculateM(String val, String separator) {
        try {
            return multiplyArray(preparedCalc(val, separator));
        } catch (Exception e) {
            NumberFormatException exception =
                    new NumberFormatException("Исключение при передаче параметра в массив список значений");
            exception.addSuppressed(e);
            throw exception;
        }
    }

    private int[] preparedCalc(String val, String separator) {
        String[] array = split(val, separator);
        int[] arrayInt = arrStringVarInt(array);
        return arrayInt;
    }

    private String[] split(String text, String separator) {
        return text.split(separator);
    }

    private int multiplyArray(int[] array) {
        int proizvVal = 1;
        for (int i = 0; i < array.length; i++) {
            proizvVal = proizvVal * array[i];
        }
        return proizvVal;
    }

    private int sumArray(int[] array) {
        int sumVal = 0;
        for (int i = 0; i < array.length; i++) {
            sumVal = sumVal + array[i];
        }
        return sumVal;
    }

    private int[] arrStringVarInt(String[] val) {
        int[] intArr = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            long l;
            try {
                l = Long.parseLong(val[i]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Значение " + val[i] + " не является числом");
            }
            if (l > Integer.MAX_VALUE) {
                throw new NumberFormatException("Число " + l + " больше допустимого " + Integer.MAX_VALUE);
            } else {
                intArr[i] = (int) l;
            }
        }
        return intArr;
    }
}
