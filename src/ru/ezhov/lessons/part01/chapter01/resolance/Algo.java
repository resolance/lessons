package ru.ezhov.lessons.part01.chapter01.resolance.;
/**
 * Created by res on 19.07.2017.
 */
public class Algo {
    private String str;
    private int column;
    private String separator;

    public static void run(String str, int column, String separator){

        String[] stringArray = str.split(separator);
        int form = 0;
        for (String i : stringArray){
            if (form <i.length()){
                form = i.length();
            }
        }
        for(int i = 0;i<stringArray.length;i++){
            for(int j = 0;j< column;j++){
                if(i<stringArray.length){
                    System.out.format("%"+form+"s",stringArray[i]);
                    i++;
                }
            }
            System.out.println("");
            i--;
        }
    }


}
