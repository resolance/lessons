package ru.ezhov.lessons.homework.resolance.homework;

import java.util.Objects;

public class HomeWork170817_2 {
    /**
     * 2 задание
     * Реализовать сравнение классов Cat, Car, House
     * Одинаковые объекты — это объекты одного класса с одинаковым содержимым полей.
     * Если хэш коды разные, то и объекты 100 разные, если хэшкоды одинаковые, то объекты все равно могут
     * быть разные, т.к. хэш ограничены 4байтами int, а классы нашей фантазией
     *
     * хеш-код — это целочисленный результат работы метода, которому в качестве входного параметра передан объект
     * хеш-код вычисляется на основании содержимого объекта (значения полей) и если у двух объектов одного
     * и того же класса содержимое одинаковое, то и хеш-коды должны быть одинаковые
     *
     * если мы переопределяем метод equals(), то обязаны переопределить метод hashCode().
     */


    public static void main(String[] args) {

        Car car = new Car();
        House home = new House();
        Cat cat = new Cat();
        // car = new HomeWork170817_2.Car("fsf");
        car.setColor("Green");
        car.setSpeed(120);
        car.setCommon("общее значение для сравнения");
        home.setCommon("общее значение для сравнения");
        System.out.println(car.getCommon());
        System.out.println(home.getCommon());
        System.out.println(car.equals(home));
        System.out.println(car.equals(cat));
        System.out.println(cat.equals(car));

        //System.out.println(cat instanceof Common);

    }



    /*@Override
    public int hashCode() {
        return super.hashCode();
    }*/

    /*@Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (this.getClass() == obj.getClass()){
            return true;
        }
        if (this.getClass()== obj.getClass()){
            return true;
        }
        return true;*/

}
