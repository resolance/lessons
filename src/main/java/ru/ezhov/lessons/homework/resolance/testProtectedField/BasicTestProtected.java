package ru.ezhov.lessons.homework.resolance.testProtectedField;

public class BasicTestProtected {
    protected int countIteration = 100;

    public void counter(){
        for (int i = 0; i < countIteration; i++){
            System.out.println(i);
        }
    }
}
