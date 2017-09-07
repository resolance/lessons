package ru.ezhov.lessons.homework.resolance.homework;

public class UseLoader implements Loader {
    //private final Loader loader;

    @Override
    public void load(String string) {
        this.load("Check load");
    }

    /*public UseLoader(final Loader loader) {
        this.loader = loader;
    }*/

    /*public void UseLoader(final String string){
        loader.load(string);
    }*/

}
