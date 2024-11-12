package ru.inno.course.lesson8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CounterTask {

    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("counter.txt");

        if (Files.exists(filePath)) {
            String counter = Files.readString(filePath); // посмотреть значение в файле (например, 1)
            int intCounter = Integer.parseInt(counter); // преобразуем счетчик из строки в число
            intCounter++; // увеличить это значение на 1
            counter = String.valueOf(intCounter); // преобразуем число в строку
            Files.writeString(filePath, counter); // записать это значение в файл
        } else {
            Files.writeString(filePath, "1");
        }
    }
}
