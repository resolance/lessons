package ru.ezhov.lessons.homework.resolance.homework;

public class UseLoader implements Loader {
    //private final Loader loader;

    @Override
    public void load(String string) {
        System.out.println(string);
    }

    /*public UseLoader(final Loader loader) {
        this.loader = loader;
    }*/

    /*public void UseLoader(final String string){
        loader.load(string);
    }*/

}
