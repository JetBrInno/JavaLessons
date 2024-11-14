package ru.inno.course.lesson9.XMLCollection;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Users {

    @XmlElement(name="user")
    private List<User> usersList;

    public Users() {
    }

    public Users(List<User> list) {
        this.usersList = list;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Users users = (Users) o;
        return Objects.equals(usersList, users.usersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usersList);
    }

    @Override
    public String toString() {
        return "Users{" +
            "usersList=" + usersList +
            '}';
    }
}
