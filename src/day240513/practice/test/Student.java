package day240513.practice.test;

public class Student extends Sortable {
    String name;
    int score;

    public Student(String name, int score) {
        super(score);
        this.name = name;
        this.score = score;
        // 具体的子类中，哪个 state 要参与比较，就把它赋值给从父类基础的那个 xxx
//        this.xxx = this.score;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.score + ")";
    }
}
