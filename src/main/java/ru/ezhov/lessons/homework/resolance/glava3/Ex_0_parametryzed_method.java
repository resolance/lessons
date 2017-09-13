package ru.ezhov.lessons.homework.resolance.glava3;

public class Ex_0_parametryzed_method {
        /**public <T1 extends Course> Ex_0_parametryzed_method(T1 course) { // конструктор
            // реализация
        }
        public <T2> Ex_0_parametryzed_method() { // конструктор
            // реализация
        }
        public <T3 extends Course> float calculateMark(T3 course) {
            // реализация
        }
        public <T4> boolean printReport(T4 course) {
            // реализация
        }
        public <T5> void check() {
            // реализация
        }
    }

         Создание экземпляра с параметром и вызов параметризованного метода с па-
    раметром выглядят следующим образом:
    Ex_0_parametryzed_method sap = new Ex_0_parametryzed_method(new Course());
    sap.printReport(new Course(7112));

         Создание экземпляра с использованием параметризованного конструктора без
    параметров требует указания типа параметра перед именем конструктора
    Ex_0_parametryzed_method sa = new <String>Ex_0_parametryzed_method();

         Аналогично для метода без параметров
    sa.<Integer>check();*/
}
