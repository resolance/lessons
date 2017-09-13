package ru.ezhov.lessons.homework.resolance.glava5.innerClass;

public class StringPrinter implements Printer<String> {

    private static int counterMethod;

    @Override
    public void print(String print) {
        counterMethod++;
        Printer<String> stringPrinter;
        if (print == null || print.length() < 10){
            stringPrinter = new ShortPrinter();
        } else {
            stringPrinter = new LongPrinter();
        }
        stringPrinter.print(print);
    }

    private class LongPrinter implements Printer<String>{

        @Override
        public void print(String print) {
            if (counterMethod < 5){
                System.out.println("i'm very lazy, try after 5 get method");
            } else {

                System.out.println("i'm long printer: " + print);
            }
        }
    }
    private class ShortPrinter implements Printer<String>{

        @Override
        public void print(String print) {
            System.out.println("i'm short printer: " + print);
        }
    }

}
