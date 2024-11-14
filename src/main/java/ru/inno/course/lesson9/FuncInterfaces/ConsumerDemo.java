package ru.inno.course.lesson9.FuncInterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import ru.inno.course.lesson5.interfaces.Notifier;
import ru.inno.course.lesson5.justclasses.Human;

public class ConsumerDemo {

    // Функц. интерфейсы
    //


    // Задача - names выводится как есть. secondNames выводится в нижнем регистре.
    public static void main(String[] args) {
        List<String> names = List.of("Галина", "Александр", "Михаил", "Евгения");
        List<String> secondNames = List.of("Мария", "Алексей", "Владислав");

        Consumer<String> standardConsumer = new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s); // тут мы пишем что хотим сделать
            }
        };

        Consumer<String> consumerToLowerCase = s -> {
            System.out.println(s.toLowerCase()); // тут мы пишем что хотим сделать
        };

        printName(names, standardConsumer);
        printName(secondNames, consumerToLowerCase);

    }

    private static void printName(List<String> names, Consumer<String> consumer) {
        System.out.println("Список имён: ");

        for (String name : names) {
            consumer.accept(name);
        }
        System.out.println("Конец списка");
    }


}
