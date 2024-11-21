package ru.inno.course.lesson11.enums;

public enum Genre {
    SCI_FI("SCI-FI", 2),
    COMEDY("Comedy", 1),
    ACTION("Action", 3),
    HORROR("Horror", 4);

    private String name;

    private int id;

    Genre(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Genre{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
    }
}
