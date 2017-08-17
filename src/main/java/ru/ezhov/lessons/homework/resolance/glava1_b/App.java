package ru.ezhov.lessons.homework.resolance.glava1_b;

/**
 * Класс выводит в консоль резултат тестовых заданий.
 *
 */
public class App {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1191, 120000, 564498760, 1300000, 18092012, 24111986, 13111988, 7082016};
        // получение четных и нечетных чисел
        OutputDataFrom data = new OutputDataFrom();
        data.outputChetnieNumber(array);
        data.outputNeChetnieNumber(array);

        //Получение мин и макс чисала из массива
        MaxAndMinNumber minAndMax = new MaxAndMinNumber();
        minAndMax.getMaxAndMin(array);

        // Массив чисел, которые делятся на 3 или 9
        DevisionBy3Or9 devisionBy3Or9 = new DevisionBy3Or9();
        devisionBy3Or9.getChekedItemByDevision3Or9(array);

        // Сортированный массив
        new SortedItemOFArray(array);
    }
}
