package ru.inno.course.lesson10.ArraysDemo;

public record Item(String name, int price, int rating) {
    @Override
    public String toString() {
        return "Item{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", rating=" + rating +
            '}';
    }
}
