package ru.inno.course.lesson9.FuncInterfaces;

import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        List<String> names = List.of("Галина", "Александр", "Михаил", "Евгения");

        Supplier<String> supplier = () -> {
            System.out.println("Это поставщик!!!"); // тут мы пишем что хотим сделать
            return "Это поставщик!!!";
        };

        printNameWithSupplier(names, supplier);
    }
    private static void printNameWithSupplier(List<String> names, Supplier<String> supplier) {
        System.out.println("Список имён: ");

        for (String name : names) {
            String something = supplier.get();
            System.out.println(something);
        }
        System.out.println("Конец списка");
    }

}
