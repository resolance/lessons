package ru.ezhov.lessons.homework.ezhov.test.numberTest;

import java.math.BigDecimal;

public class TypeTest {
    public static void main(String[] args) {
        //byte -> short -> int -> long -> float -> double
        //int i = 10f + 15l;
        int i = (int) 10F + (int) 15L;
        System.out.println(i);

        short d = (short) 500F - 5;
        System.out.println(d);

        double dd = 1 / 10;

        BigDecimal bigDecimal1 = new BigDecimal(1);
        BigDecimal bigDecimal2 = new BigDecimal(10);
        BigDecimal bigDecimal3 = bigDecimal1.divide(bigDecimal2);

        System.out.println("---> " + bigDecimal3.doubleValue());

        System.out.println(dd);
        System.out.println(0.1D == dd);
    }
}
