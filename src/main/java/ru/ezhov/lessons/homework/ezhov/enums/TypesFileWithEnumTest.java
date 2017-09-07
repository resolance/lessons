package ru.ezhov.lessons.homework.ezhov.enums;

public class TypesFileWithEnumTest {

    public static void main(String[] args) {
        args = new String[]{"C:/Users/rrnezh/ntuser.dat.LOG1", "json"};

        String typeValueFromCommandArgs = args[1];

        TypesFile correctVal =
                TypesFile.valueOf(
                        typeValueFromCommandArgs.toUpperCase()
                );

        System.out.println("type: " + correctVal + " id: " + correctVal.getId());

        switch (correctVal) {
            case XML:
                System.out.println("xml");
                break;
            case HTML:
                System.out.println("html");
                break;
            case JSON:
                System.out.println("json");
                break;
            case TXT:
                System.out.println("txt");
                break;
        }
    }
}
