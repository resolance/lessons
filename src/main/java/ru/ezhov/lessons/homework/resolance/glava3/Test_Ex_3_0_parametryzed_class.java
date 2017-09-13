package ru.ezhov.lessons.homework.resolance.glava3;

public class Test_Ex_3_0_parametryzed_class {
    public static void main(String[] args) {
        //Параметризация Integer
        System.out.println("Параметризация типом Integer");
        Ex_3_0_parametryzed_class<Integer> objectInitializedByIntegerStraight = new Ex_3_0_parametryzed_class<>(50);
        Ex_3_0_parametryzed_class<Integer> objectInitializedByIntegerViaSetter = new Ex_3_0_parametryzed_class<Integer>();
        objectInitializedByIntegerViaSetter.setValue(25);
        Ex_3_0_parametryzed_class<Integer> objectInitByDiamand = new Ex_3_0_parametryzed_class<>();
        objectInitByDiamand.setValue(15);

        System.out.println(objectInitializedByIntegerStraight);
        System.out.println(objectInitializedByIntegerViaSetter);
        System.out.println(objectInitByDiamand.getValue());


      //Параметризация типом String
        System.out.println("\nПараметризация типом String");
        Ex_3_0_parametryzed_class<String> objectInitByString = new Ex_3_0_parametryzed_class<>("Say Hi!");
        System.out.println(objectInitByString.getValue());

      // Параметризация типом Object
        System.out.println("\nПараметризация(по умолчанию) типом Object");
        Ex_3_0_parametryzed_class objectInitByObject = new Ex_3_0_parametryzed_class();
        System.out.println(objectInitByObject.getValue());

        objectInitByObject.setValue(new Byte((byte)1));
        System.out.println(objectInitByObject);
        objectInitByObject.setValue("Java pricoluhi");
        System.out.println(objectInitByObject);
        System.out.println(objectInitByObject.getValue());
        objectInitByObject.setValue(71);
        System.out.println(objectInitByObject);

     //Параметризованные методы



    }
}
