package ru.inno.course.lesson8;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import ru.inno.course.lesson5.justclasses.Human;

public class HumanToJsonFile {

    public static void main(String[] args) throws IOException {
        // Преобразуем объект в json

        Human oleg = new Human("Олег", 60);
        Human alex = new Human("Алекс", 33);
        Human vlad = new Human("Влад", 19);

        Path filePath = Path.of("humans.json");
        ObjectMapper objectMapper = new ObjectMapper();
        List<Human> humans = List.of(oleg, alex, vlad);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(filePath.toFile(), humans); // записываем объект human в oleg.json
    }
}
