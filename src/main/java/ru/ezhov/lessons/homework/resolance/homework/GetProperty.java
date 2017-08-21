package ru.ezhov.lessons.homework.resolance.homework;

import java.util.Arrays;
import java.util.Date;

public class GetProperty {
    public static void main(String[] args) {
        //System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        //System.out.println(System.getProperty("java.library.path"));
        //System.out.println(new Date());
        String path = System.getProperty("java.library.path");
        String[] arPath = path.split(";");
        for (String s : arPath) {
            System.out.println(s);
        }
        //System.out.println(Arrays.toString(arPath));
        int count = 0;
        String s;
        for (int i = 0; i < 40; i++){
            s = String.valueOf(i);
            System.out.print(s + ", ");
            if (s.contains("3")){
                count++;
            }
        }
        System.out.println(count);
    }
}



