package ru.ezhov.lessons.homework.ezhov.immutable;

public class ImmutableObjectTest {
    public static void main(String[] args) {
        ImmutableObject immutableObject =
                new ImmutableObject("text", 10);

        System.out.println(immutableObject.getName());

        ImmutableObject immutableObject1 = immutableObject.setName("fuck");

        System.out.println(immutableObject.getName());
        System.out.println(immutableObject1.getName());

    }
}
