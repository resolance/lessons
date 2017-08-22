package ru.ezhov.lessons.homework.resolance.homework;

public class Cat implements Common{
    private int age;
    private String name;
    private String common;

    public Cat() {
        System.out.println("Класс Cat:");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommon() {
        return common;
    }
    public void serCommon(String common){
        this.common = common;
    }
    @Override
    public boolean equals(Object obj) {
        //Car car = (Car)obj;
        if(this instanceof Common == obj instanceof Common){
            return true;
        }
       /*if ( obj instanceof Common){
           return true;
        }*/

        return false;
    }
}