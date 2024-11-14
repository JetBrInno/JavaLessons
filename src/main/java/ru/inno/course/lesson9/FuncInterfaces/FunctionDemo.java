package ru.inno.course.lesson9.FuncInterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        List<String> names = List.of("Галина", "Александр", "Михаил", "Евгения");

        Function<String, String> function = s -> {
            System.out.println("Это функц. интерфейс");
            return s.toLowerCase(); // тут мы пишем что хотим сделать
        };

        printName(names, function);
    }
    private static void printName(List<String> names, Function<String, String> function) {
        System.out.println("Список имён: ");

        for (String name : names) {
            String lowerName = function.apply(name);
            System.out.println(lowerName);
        }
        System.out.println("Конец списка");
    }
}
