package day240415.practice.e1;

public class Student {
    // 1. state (field, var...)
    int number;
    int state;
    int score;

    // 3. constructor
    public Student(int n) {
        number = n;
        state = (int) (Math.random() * 6 + 1); // 1-6
        score = (int) (Math.random() * 101); // 0- 100
    }


    // 2. behavior (method, function...)
    public void show() {
        System.out.println("学号=" + number + "，年级=" + state + "，分数=" + score);
    }
}
