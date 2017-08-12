package ru.ezhov.lessons.homework.ezhov.file;

public interface Processor<T, E> {
    T process(E source);
}
