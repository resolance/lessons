package ru.ezhov.lessons.homework.ezhov.test;

public class MethodTest {
    public static void main(String[] args) {
        TestMethods testMethods = new TestMethods();
        testMethods.test("5", 5);
        testMethods.test("10F", 10F);
        testMethods.test("10L", 10L);
        testMethods.test("10F", 1000000000000000000F);
        testMethods.test("10D", 10D);
        testMethods.test("(byte) 10", (byte) 130);

        Integer integer = 10;
    }
}

class TestMethods {
    public void test(String val, int i) {
        System.out.println("int: " + i + " val: " + val);
    }
    public void test(String val, Integer i) {
        System.out.println("Integer: " + i + " val: " + val);
    }

    public void test(String val, Number i) {
        System.out.println("number: " + i + " val: " + val);
    }
    public void test(String val, float i) {
        System.out.println("float: " + i + " val: " + val);
    }

//    public void test(String val, Double i) {
//        System.out.println("double: " + i + " val: " + val);
//    }
}
