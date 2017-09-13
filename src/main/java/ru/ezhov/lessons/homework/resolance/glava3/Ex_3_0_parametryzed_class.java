package ru.ezhov.lessons.homework.resolance.glava3;

public class Ex_3_0_parametryzed_class<T> {
    private T value;
    public Ex_3_0_parametryzed_class(){}

    public Ex_3_0_parametryzed_class(T value){
        this.value = value;
    }
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String toString(){
        if (value == null){
            return null;
        }
    return value.getClass().getName() + " : " + value;
    }
}
