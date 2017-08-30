package ru.ezhov.lessons.homework.ezhov;

public class SuperTest {
}


class Dog {
    public Dog(int i, int b) {

    }
}


class BadDog extends Dog {

    public BadDog(int i, int b) {
        super(2, 2);
    }

    public BadDog() {
        super(2, 2);
    }
}
