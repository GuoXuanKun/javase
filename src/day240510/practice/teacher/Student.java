package day240510.practice.teacher;

public class Student extends Sortable {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.score + ")";
    }

    @Override
    public int compareTo(Sortable sortable) {
        return 0;
    }
}
