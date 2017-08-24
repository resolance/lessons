package ru.ezhov.lessons.homework.resolance.homework;

import java.util.Objects;

public class HomeWork170817_2 {
    /**
     * 2 задание
     * Реализовать сравнение классов Cat, Car, House
     * Одинаковые объекты — это объекты одного класса с одинаковым содержимым полей.
     * Если хэш коды разные, то и объекты 100 разные, если хэшкоды одинаковые, то объекты все равно могут
     * быть разные, т.к. хэш ограничены 4байтами int, а классы нашей фантазией
     * <p>
     * хеш-код — это целочисленный результат работы метода, которому в качестве входного параметра передан объект
     * хеш-код вычисляется на основании содержимого объекта (значения полей) и если у двух объектов одного
     * и того же класса содержимое одинаковое, то и хеш-коды должны быть одинаковые
     * <p>
     * если мы переопределяем метод equals(), то обязаны переопределить метод hashCode().
     *
     * 3. Изучить методы класса Object
     * Знать для чего они применяются
     * Написать примеры использования методов:
     * equals()
     * hashCode()
     * toString()
     * Знать и понимать основные правила переопределения методов hashCode() и equals().
     * Приводим примеры.
     * 5. Реализовать подсчет количества созданных объектов класса.
     */


    public static void main(String[] args) {

        System.out.println("Сравниваем дома, для которых переписали метод equals. " +
                "Сравниваются значения полей класса.");
        House home = new House();
        home.setCommon("общее значение для сравнения");

        House home2 = new House();
        home2.setCommon("общее значение для сравнения");
        System.out.println("Объект home равен самому себе: " + (home.equals(home)));
        System.out.println("Сравнение объекта home и null: " + (home.equals(null)));
        System.out.println("Сравнение объектов home и home2: " + (home.equals(home2)));
        System.out.println("Сравнение объектов home2 и home: " + (home2.equals(home)));

        House home3 = new House();
        //home3.setCommon("общее значение для сравнения");
        System.out.println("Сравнение объектов home home3: " + (home.equals(home3)));
        System.out.println("Сравнение объектов home3 home2: " + (home3.equals(home2)));
        System.out.println(home.getCommon());
        System.out.println(home2.getCommon());

        // Распечатываем коунт созданных экземпляров класса отдельно
        System.out.println("Отдельно достали счетчик созданных экземпляров: " + home.getCount());

        // Выводим хэшкод
        System.out.println("hashCode home2: " + home2.hashCode());
        System.out.println("hashCode home: " + home.hashCode());
        System.out.println("hashCode home3: " + home3.hashCode());


        Cat cat = new Cat();
        // car = new HomeWork170817_2.Car("fsf");
        Car car = new Car();
        car.setColor("Green");
        car.setSpeed(120);
        car.setCommon("общее значение для сравнения");

        //Проверка значений полей
        //System.out.println(car.getCommon());
        //System.out.println(home.getCommon());

        System.out.println("Сравнение ссылок на объкты: " + (car.getCommon() == home.getCommon()));
        // тут вопрос, почему так выходит
        System.out.println("Сравнение ссылок на объкты и метод intrern: "
                + (car.getCommon().intern() == home.getCommon().intern()));

        System.out.println(car.equals(home));
        System.out.println(car.equals(cat));
        System.out.println(cat.equals(car));


        //System.out.println(cat instanceof Common);

    }

}
