package ru.ezhov.lessons.homework.resolance;

/**
 * Created by res on 19.07.2017.
 */

//1. Уйти от использования статических методов
//2. НАйти ошибки в методе main
//3. Сохранить разделитель, и добавлять его перед слово
//4. Добавлять пробел, перед столбцами, чтоб длинное слово было не в упор к предыдущему столбцу
//5. Добавить модульности

public class Start {
    public static void main(String[] args) {
        String arg0 = "первый,второй,третий,четвертый,пятый,шестой,7,123,ывафыафыва";
        int arg1 = 3;
        String arg2 = ",";

        Algo algo = new Algo();
        //algo.run(args[0],Integer.parseInt(args[1]),args[2]);
        algo.run(arg0, arg1, arg2);
    }
}
