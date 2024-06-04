package day240604.practice.teach;

import java.io.Serializable;

public class CustomObj implements Serializable {
    // strongly recommended that all serializable classes other than enum types explicitly declare serialVersionUID values
    // ANY-ACCESS-MODIFIER
    private static final long serialVersionUID = 998800L;

    String name;
    int value;
    //int id;

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
