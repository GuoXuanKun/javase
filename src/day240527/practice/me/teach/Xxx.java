package day240527.practice.me.teach;

public class Xxx implements Comparable<Xxx> {
    int value;

    public Xxx(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Xxx{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Xxx o) {
        return Integer.compare(this.value, o.value);
    }
}
