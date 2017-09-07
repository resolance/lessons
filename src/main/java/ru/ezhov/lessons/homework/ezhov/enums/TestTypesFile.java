package ru.ezhov.lessons.homework.ezhov.enums;

public class TestTypesFile {
    private String typeValueFromCommandArgs;

    public static void main(String[] args) {
        args = new String[]{"C:/Users/rrnezh/ntuser.dat.LOG1", "xml"};

//        String[] arr = Types.ARRAY_TYPES;
//        arr[0] = "FUCK";
//        System.out.println(Types.ARRAY_TYPES[0]);

        String typeValueFromCommandArgs = args[1];

        String correctVal = null;

        for (String s : Types.ARRAY_TYPES) {
            if (s.equals(typeValueFromCommandArgs.toUpperCase())) {
                correctVal = s;
            }
        }

        if (correctVal == null) {
            throw new IllegalArgumentException(
                    "Fuck off with: " +
                            typeValueFromCommandArgs);
        }

        //save file


//        TypesFile typesFile = TypesFile.TXT;
//        TypesFile typesFile1 = TypesFile.valueOf(type.toUpperCase());
//        System.out.println(typesFile1);


    }
}
