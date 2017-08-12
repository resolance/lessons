package ru.ezhov.lessons.homework.ezhov.file;


import java.io.File;

public class App {
    public static void main(String[] args) {
        File file1 = new File("C:\"");
        File file2 = new File("D:\"");

        //FileReader fileReader1 = new FileReader();
        FileReader fileReader = new FileReader(file1);

        System.out.println(fileReader.read());
        System.out.println(fileReader.readUppercase());
        fileReader.equalFiles();

        Processor processor = new StringProcessor();
        System.out.println(processor.process("test"));




    }
}
