package ru.inno.course.lesson9.Records.Records;

import java.util.Objects;

public class HumanC {
    private String name;

    private String email;

    public HumanC(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HumanC humanC = (HumanC) o;
        return Objects.equals(name, humanC.name) && Objects.equals(email, humanC.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "HumanC{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
    }
}
