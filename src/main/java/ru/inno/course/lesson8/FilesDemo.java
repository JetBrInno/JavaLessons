package ru.inno.course.lesson8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("text.txt"); // Указываем путь к файлу
        Files.writeString(filePath,"Hello world"); // сохраняем строку в файл


        Path myFilePathToRead = Path.of("src/main/java/ru/inno/course/lesson8/mysupertextfile.txt"); // Указываем путь к файлу
        String stringFromText = Files.readString(myFilePathToRead); // считываем текст из файла в строку
        System.out.println(stringFromText);
    }
}
