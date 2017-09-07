package ru.ezhov.lessons.homework.ezhov.test;

public class Quest3 {

    private static String chlen;


    public static int method() {
        final int loc;
        //System.out.println(loc);//1
        loc = 4;//2
        return loc + 1;//3
    }

    public  void test(){
        chlen = "f";
    }

    public static void main(String[] args) {
        method();
        method();
        method();
        System.out.println(method());
    }
}
