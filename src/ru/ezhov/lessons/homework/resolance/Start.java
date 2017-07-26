package ru.ezhov.lessons.part01.chapter01.resolance;
/**
 * Created by res on 19.07.2017.
 */
public class Start {
    public static void main(String[] args) {
        String arg0 = "первый,второй,третий,четвертый,пятый,шестой,7,123,ывафыафыва";
        int arg1 = 3;
        String arg2 = ",";

        Algo algo = new Algo();
        //algo.run(args[0],Integer.parseInt(args[1]),args[2]);
        algo.run(arg0,arg1,arg2);
    }
}
