package ru.ezhov.lessons.homework.ezhov.thread;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


        new Thread(new Gsl(new ArrayList())).start();


        new Gsl(new ArrayList()).print();
    }
}


class Gsl implements Runnable{
    private List list;

    public Gsl(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("test");
    }


    public void print(){
        System.out.println("fuck");
    }

}
