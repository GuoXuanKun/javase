package day240527.practice.me.teach;

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
    public boolean equals(Object obj) {
        if (obj instanceof CustomObj otherObj) {
            return this.id == otherObj.id;
        } else {
            return false;
        }
    }
}
