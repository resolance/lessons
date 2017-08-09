package ru.ezhov.lessons.homework.suvorov_vm.Glava1;

import java.util.Scanner;

public class Var1_5 {
    public static void main(String[] args) {
        System.out.println("Введите целые числа через пробел");
        Scanner scan = new Scanner(System.in);
        String znachScan = scan.next();
        try {
            String[] spisokVal = znachScan.split(" ");
            int[] znachVichisleniy = arrStringVarrInt(spisokVal);
            int sumVal = 0;
            int proizvVal = 1;

            for (int i = 0; i < znachVichisleniy.length; i++)
            {
                sumVal = sumVal + znachVichisleniy[i];
                proizvVal = proizvVal * znachVichisleniy[i];
            }

            System.out.println("сумма = " + sumVal + "произведение = " + proizvVal);

        }
        catch(Exception e)
        {
            System.out.println("Исключение при передаче параметра в массив список значений");
        }
    }

    public static int[] arrStringVarrInt(String[] val)
    {
        int[] intArr = new int[val.length];
            for(int i = 0; i < val.length; i++)
            {
                intArr[i] = Integer.parseInt(val[i]);
            }
        return intArr;
    }
}
