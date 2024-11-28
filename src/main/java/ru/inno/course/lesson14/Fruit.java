package ru.inno.course.lesson14;

public abstract class Fruit {
    protected String color;

    protected String size = "big";

    public abstract int getPrice();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
