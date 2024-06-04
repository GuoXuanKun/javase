package day240604.practice.teach;

public class CustomObj {
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
