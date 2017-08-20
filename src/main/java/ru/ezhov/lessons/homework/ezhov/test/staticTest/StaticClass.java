package ru.ezhov.lessons.homework.ezhov.test.staticTest;

public class StaticClass {
    private static final String TEST = "TEST";
    public static final String TEST_ONE = "TEST";

    private String test = "test";

    public void testStatic() {
        String t = TEST;
        t = TEST_ONE;
    }

    public static void test() {
        //не могу обратиться, так как в статических методах используются только статические поля
        //String s = test;

        final int i = 10;
        //i = 40; //финальная переменная

        final Test test = new Test("test");
        test.setTest("fuck");

        Test test1 = new Test("f");
        test1 = new Test("w");


        Test1 test11 = new Test1("fuck");
        System.out.println(test11.getYes());

        Object f = 365f;

        System.out.println(f.getClass().getName());

    }


}


class Test {
    private String test;

    public Test(String test) {
        this.test = test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}

class Test1 {
    private final String yes;

    public Test1(String yes) {
        this.yes = yes;
    }

    public String getYes() {
        return yes;
    }
}