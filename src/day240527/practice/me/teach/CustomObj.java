package day240527.practice.me.teach;

import java.util.Objects;

public class CustomObj {
    int id;
    String name;

    public CustomObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomObj customObj = (CustomObj) o;
        return id == customObj.id && Objects.equals(name, customObj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
