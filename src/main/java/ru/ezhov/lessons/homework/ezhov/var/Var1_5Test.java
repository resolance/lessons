package ru.ezhov.lessons.homework.ezhov.var;

public class Var1_5Test {
    public static void main(String[] args) {
        Var1_5 var1_5 = new Var1_5();
        try {
            int sum = 5;
            int rS = var1_5.calculateS("1 1 1 1 1", " ");
            if (sum != rS) throw new Exception("неверная сумма");

            int mult = 1;
            int rM = var1_5.calculateM("1 1 1 1 1", " ");
            if (mult != rM) throw new Exception("неверное произведение");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
