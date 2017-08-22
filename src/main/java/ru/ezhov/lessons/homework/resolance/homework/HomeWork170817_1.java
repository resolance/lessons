package ru.ezhov.lessons.homework.resolance.homework;

import java.util.Objects;

/**
 * 1. Как хранятся строки в Java
 Изучить и объяснить метод intern.
 2. Изучить сравнение объектов
 Реализовать сравнение классов Cat, Car, House
 3. Изучить методы класса Object
 Знать для чего они применяются
 Написать примеры использования методов:
 clone()
 equals()
 hashCode()
 toString()
 Знать и понимать основные правила переопределения методов hashCode() и equals().
 Приводим примеры.
 4. Изучить применение слова final (для объектов)
 5. Реализовать подсчет количества созданных объектов класса.
 6. Что такое this пример
 7. Знать автоупаковку


 8. Без среды разработки написдать класс выводящий hello world и запускаемый через консоль
 Понедельник 21-00: Миша
 Вторник 21-00: Костя
 Среда 21-00: Влад
 */


public class HomeWork170817_1 {


    public static void main(String[] args) {
        /**   1 задание
         */
        /*Строки хранятся в виде массива char[] в utf-16 (запустим дебаг то увидим value = char{13}@460)
        Строки - константы, хранятся в в особой области в Heap, в string pool

        intern() - Returns a canonical representation for the string object.
        All literal strings and string-valued constant expressions are
        interned.

         Когда создаем объект стринг, он помещается в пул строк и когда создаем объект
         вида
         String s = "sdf", сначала ищется строка в пуле и если находится возвращается
         ссылка на нее, если нет, создается новая строка в пуле, а затем возвращается ссылка
         Если явно используется new String, то создается новый объект строки. После можно
         использовать метод inter(), чтобы поместить строку в пул или получить из пула ссылку
         в на другой объект String c таким же значением.
         Почему тупил в четверг
         == - применятся, когда сравниваем ссылки на объект в памяти(к примеру ya.ru и ya.ru)
         equals() - применяется, когда хотим сравнить кишки объекта.
*/
        String s = "Java_homework";
        String second = "Java_homework";
        // здесь ссылки будет вести на одну строку в пуле строк
        System.out.println(s == second); //true
                    //Создаем новую строку принудительно//
        String newString = new String("Java_homework");
                    // убедимся что объекты эквивалентны, но ссылки видут на разные объекты
        System.out.println(newString == second); //false
        System.out.println(newString.equals(second)); //true
                     //теперь методом intern() интернируем строки. т.к. значение строки у нас одно, в результате получиться 3 ссылки
                    // на одину константу
        newString = newString.intern();
                    // Проверим, что теперь все ссылки ведут на один объект
        System.out.println("s == second " + (s == second));
        System.out.println("s == newString " + (s == newString));
        System.out.println(second.equals(s));
        System.out.println(s.equals(newString));

        // Распечатаем строку как массыв чаров
        String compare = "shgjgfhdhfdsf";
        for (int i = 0; i < compare.length(); i++) {
            System.out.print(compare.charAt(i) + " ::: ");
            //распечатаем сразу и их коде поинт
            System.out.println(compare.codePointAt(i));
        }
        // Делаем проверку
        char ch = 102;
        System.out.println("char = 102 = " + ch);
                    //вопрос, к какому интернируется? к первому в списке?



    }
}
