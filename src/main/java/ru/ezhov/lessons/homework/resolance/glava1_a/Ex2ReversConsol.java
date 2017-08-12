package ru.ezhov.lessons.homework.resolance.glava1_a;

class Ex2ReversConsol {
    String[] argFromConsol(String[] args) {
        String reversArray[] = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            reversArray[i] = args[args.length - 1 - i];
        }
        return reversArray;
    }
}
