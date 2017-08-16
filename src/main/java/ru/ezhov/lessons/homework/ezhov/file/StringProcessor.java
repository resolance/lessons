package ru.ezhov.lessons.homework.ezhov.file;

public class StringProcessor implements Processor<String, String> {
    @Override
    public String process(String source) {
        return "1" + source;
    }
}
