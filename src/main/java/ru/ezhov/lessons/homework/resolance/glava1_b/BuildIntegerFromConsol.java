package ru.ezhov.lessons.homework.resolance.glava1_b;

/**
 * Получаем нечетные числа из массива интов
 * Проверка идет на остаток от деления на 2. Если 0 то четное. Результат возврашается
 * в виде true или false
 */
public class BuildIntegerFromConsol {
    public final int[] BuildIntegerFromConsol(String[] val) {
        int[] intArr = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            long l;
            try {
                l = Long.parseLong(val[i]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Значение " + val[i] + " не является числом");
            }
            if (l > Integer.MAX_VALUE) {
                throw new NumberFormatException("Число " + l + " больше допустимого " + Integer.MAX_VALUE);
            } else {
                intArr[i] = (int) l;
            }
        }
        return intArr;
}
}
