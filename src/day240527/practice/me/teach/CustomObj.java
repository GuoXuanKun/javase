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
        // 可以在下一行打断点测试，同时也在 equals 中打断点。两元素的 hashCode 相同才会再通过 equals 进一步判断，以提高性能。
        return Objects.hash(id, name);
    }
}
