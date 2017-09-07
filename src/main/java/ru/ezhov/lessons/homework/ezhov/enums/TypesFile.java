package ru.ezhov.lessons.homework.ezhov.enums;

public enum TypesFile {
    XML(0), JSON(1), HTML(2), TXT(3);

    private int id;

    TypesFile(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
