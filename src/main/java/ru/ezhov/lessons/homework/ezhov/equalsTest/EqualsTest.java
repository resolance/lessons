package ru.ezhov.lessons.homework.ezhov.equalsTest;

import java.util.ArrayList;
import java.util.List;

public class EqualsTest {
    public static void main(String[] args) {
        Dog dog = new Dog("ball");

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog);

        System.out.println("contains: " + dogList.contains(dog));
        System.out.println(dog.equals(new Dog("test")));


        //System.out.println(dog.equals(dog));

        Dog dog1 = new Dog("ball");
        //System.out.println(dog.equals(dog1));
    }
}


class Dog {
    public String name;
    private int age = 100;

    public Dog(String name) {
        this.name = name;
    }

    //        1.Рефлективность, для любой ссылки на значение х выражение
//        х.equals(x) должно возвращать true.
//        2.Симметричность, для любых ссылок на значения х и у
//        выражение х. equals(y) должно возвращать t гue тогда и только тогда, когда y.equals(x)
//        возвращает true.
//        3.Транзитивность, для любых ссылок на значения х, у и z,
//        если x.equals(y) возвращает true и y.equals(z) возвращает true, то и выражение х.
//                equals(z) должно возвращать true.
//        4.Непротиворечивость. Для любых ссылок на значения х и у,
//        если несколько раз вызвать х. equals(y), постоянно будет возвращаться значение true либо
//        постоянно будет возвращаться значение false при условии, что никакая информация,
//        используемая при сравнении объектов, не поменялась.
//        5.Для любой ненулевой ссылки на значение х выражение х. equals(null) должно возвращать
//        false
    @Override
    public boolean equals(Object o) {
        boolean isEquals;

        if (this == o) {
            isEquals = true;
        } else if (o == null || getClass() != o.getClass()) {
            isEquals = false;
        } else {
            Dog dog = (Dog) o;

            if (name != null) {
                isEquals = name.equals(dog.name);
                isEquals = (age == dog.age);
            } else {
                isEquals = dog.name == null;
            }
        }

        return isEquals;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        return true;
    }

}
