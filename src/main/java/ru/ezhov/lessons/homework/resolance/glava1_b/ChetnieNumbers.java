package ru.ezhov.lessons.homework.resolance.glava1_b;
/**
 * Получаем нечетные числа из массива интов
 * Проверка идет на остаток от деления на 2. Если 0 то четное. Результат возврашается
 * в виде true или false
 */
public class ChetnieNumbers {
    public final boolean ifIsNumberChet(int inputData){
       int devisionByTwo = (inputData % 2);
       if (devisionByTwo == 0) {
           return true;
       }else{
           return false;
       }
    }
}
