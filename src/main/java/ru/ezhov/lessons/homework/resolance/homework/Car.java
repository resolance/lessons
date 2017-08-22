package ru.ezhov.lessons.homework.resolance.homework;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

public class Car implements Common{
    private String color;
    private int speed;
    private String common;

    public Car(){
        System.out.println("Класс Car:");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public String getCommon(){
        return common;
    }
    public void setCommon(String common){
        this.common = common;
    }

    public String toString(){

        return ("getColor: " + getColor() + "\n" +
                "getSpeed: " + getSpeed() + "\n" +
                "getCommon: " + getCommon() + "\n");
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
