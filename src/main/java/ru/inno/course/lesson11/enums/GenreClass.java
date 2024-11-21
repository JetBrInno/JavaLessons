package ru.inno.course.lesson11.enums;

import java.util.Objects;

public class GenreClass {
    public static final GenreClass SCI_FI = new GenreClass("SCI-FI", 2);
    public static final GenreClass COMEDY = new GenreClass("Comedy", 1);
    public static final GenreClass ACTION = new GenreClass("Action", 3);
    public static final GenreClass HORROR = new GenreClass("Horror", 4);
    public static final GenreClass SCARY_MOVIE = new GenreClass("SCARY_MOVIE", 5);

    private String name;

    private int id;

    private GenreClass(String name, int id) {
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenreClass that = (GenreClass) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "GenreClass{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
    }
}
