package ru.inno.course.lesson9.XMLCollection;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import ru.inno.course.lesson5.justclasses.Human;

public class ObjectsToXMLFile {

    public static void main(String[] args) throws JAXBException {
        User user1 = new User("SuperUser", "superuser@mail.ru");
        User user2 = new User("admin", "admin@mail.ru");

        List<User> usersListArray = new ArrayList<>();
        usersListArray.add(user1);
        usersListArray.add(user2);
        Users users = new Users(usersListArray);

        Path filePath = Path.of("users.xml");
        JAXBContext context = JAXBContext.newInstance(Users.class); // будем работать с классом Users
        Marshaller marshaller = context.createMarshaller();

        marshaller.marshal(users, filePath.toFile());

    }
}
