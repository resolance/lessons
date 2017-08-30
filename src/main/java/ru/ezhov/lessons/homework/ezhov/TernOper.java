package ru.ezhov.lessons.homework.ezhov;

public class TernOper {

    public static void main(String[] args) {
        int res;

        if (10 == 10) {
            res = 15;
        } else {
            res = 56;
        }

        res = 10 == 10 ? 15 : 56;
    }
}
