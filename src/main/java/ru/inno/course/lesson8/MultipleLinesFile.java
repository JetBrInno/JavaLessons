package ru.inno.course.lesson8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MultipleLinesFile {

    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("text.txt"); // Указываем путь к файлу
        Files.writeString(filePath,"Побег из Шоушенка\n", StandardOpenOption.CREATE); // сохраняем строку в файл
        Files.writeString(filePath,"1+1\n", StandardOpenOption.APPEND); // сохраняем строку в файл
        Files.writeString(filePath,"Остров проклятых\n", StandardOpenOption.APPEND); // сохраняем строку в файл

        String stringFromText = Files.readString(filePath); // считываем текст из файла в строку
        System.out.println(stringFromText);
    }
}
