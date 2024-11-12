package ru.inno.course.lesson8;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.nio.file.Path;
import ru.inno.course.lesson5.justclasses.Human;

public class XmlToHumanAndHumanToXml {

    public static void main(String[] args) throws JAXBException {
        Path filePath = Path.of("human.xml");

        JAXBContext context = JAXBContext.newInstance(Human.class); // будем работать с классом Human
        // Распаковываем xml в объект
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Human oleg = (Human) unmarshaller.unmarshal(filePath.toFile());
        System.out.println(oleg);

        // Упаковываем объект в xml
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(new Human("Алекс",11), filePath.toFile());

    }
}
