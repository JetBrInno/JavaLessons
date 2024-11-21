package ru.inno.course.lesson8;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
import ru.inno.course.lesson5.justclasses.Human;

public class JsonFileToHuman {

    public static void main(String[] args) throws IOException {
        // Преобразуем json в объект

        Path filePath = Path.of("oleg.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Human human = objectMapper.readValue(filePath.toFile(), Human.class);

        System.out.println(human);
    }
}
