package ru.ezhov.lessons.homework.ezhov.immutable;

public class ImmutableObject {
    private String name;
    private int id;

    public ImmutableObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ImmutableObject setName(String name) {
        return new ImmutableObject(name, this.id);
    }

    public ImmutableObject setId(int id) {
        return new ImmutableObject(this.name, id);
    }
}
