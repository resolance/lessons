package ru.ezhov.lessons.homework.resolance.glava3;

import java.util.Date;

public class Quest7<T> {
    private T pole;

    public Quest7(T pole) {
        this.pole = pole; //1
    }

    public void setPoleDefault() {
        // pole.setTime(1000); //2

        System.out.println(pole);
    }

    public static void main(String[] args) {
        Quest7<Date> obj1 = new Quest7<Date>(new Date());//3
        obj1.setPoleDefault();

        Quest7<Integer> obj2 = new Quest7<Integer>(14);//3
        obj2.setPoleDefault();

        QuestDate<Date> dateQuestDate = new QuestDate(new Date());
        dateQuestDate.printOnlyDate();
        QuestDate<ExtDate> dateQuestDate1 = new QuestDate(new ExtDate());
        dateQuestDate1.printOnlyDate();

        IntCaluclator intCaluclator = new IntCaluclator();
        intCaluclator.calculate(10, 456);
    }
}

class QuestDate<T extends Date> {
    private T pole;

    public QuestDate(T pole) {
        this.pole = pole;
    }

    public void printOnlyDate() {
        System.out.println(pole.getTime());
        pole.setTime(1000);
        System.out.println(pole);
    }
}

class ExtDate extends Date {

}


abstract  class AbstarctCalculator<T extends Number>{
    abstract void calculate(T val1 , T val2);
}

class IntCaluclator extends AbstarctCalculator<Integer>{

    @Override
    void calculate(Integer val1, Integer val2) {
        System.out.println(val1 + val2);
    }
}

