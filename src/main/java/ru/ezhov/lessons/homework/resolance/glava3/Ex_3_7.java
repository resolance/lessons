package ru.ezhov.lessons.homework.resolance.glava3;

public class Ex_3_7<T> {
   /* private T pole;

    public Ex_3_7(T pole) {
        this.pole = pole;
    }

    public void setPoleDefault() {
        pole.setTime(1000);
    }

    public static void main(String[] args) {
        Ex_3_7<Date> obj = new Ex_3_7<Date>(new Date());
        obj.setPoleDefault();
    }*/
/**-------------------------------------------------------------------------------------------*/
    //public class Quest8<T1, T2> {}//
    //Укажите корректый способ создания экземпляра класса
    //1) +++++
    //Quest8 obj = new Quest8 ();
    //2) нет второго аргумента
    //Quest8<Object> obj = new Quest8<Object> ();
    //3) +++++
    //Quest8<Object, Object> obj = new Quest8<Object, Object> ();
    //4)
    //Quest8<…, Object> obj = new Quest8<…, Object> ();
    //5) Перепутаны мемтами типы
    //Quest8<Object, Integer> obj = new Quest8<Integer, Object> ();
    //6) Ссылка типа Number, а объект создаем типа Integer
    //Quest8<Number, Integer> obj = new Quest8<Integer, Integer> ();
/**-------------------------------------------------------------------------------------------*/
    enum Numbers {ONE, TWO, THREE, FOUR, FIVE}
        public static void main (String [] args) {
            Numbers n1 = Numbers.ONE;
            Numbers n2 = Numbers.ONE;//1
            if (n1 == n2) {System.out.print ("true");}
            else {System.out.print ("false");}
            System.out.println (Numbers.FIVE.ordinal ());//2

        }
        // выведет: true4
        //true т.к это enum, они создаются в одном экземпляре, все инициализируются сразу, поэтому ссылка
        // всегда на один объект. метод ordinal - выводит номер, под которым enum записан (int начинается с 0)

}
/**-------------------------------------------------------------------------------------------*/

    /*Выберите неправильные утверждения (3):
        1) перечисление является классом
      -  2) при объявлении перечисления его необходимо явно наследовать от класса java.lang.Enum
      -  3) в теле перечисления можно объявлять только методы
      -  4) конструктор перечисления может быть объявлен со спецификатором public*/