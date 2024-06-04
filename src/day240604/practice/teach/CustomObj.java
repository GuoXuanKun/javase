package day240604.practice.teach;

import java.io.Serializable;

public class CustomObj implements Serializable {
    String name;
    int value;

    public CustomObj(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomObj{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
