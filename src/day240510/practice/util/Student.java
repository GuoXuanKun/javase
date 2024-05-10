package day240510.practice.util;

public class Student extends All {

    // state
    int number;
    int state;
    int score;

    // behavior
    public void setNumber(int number) {
        this.number = number;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // constructor
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }

    public Student(int number, int state, int score) {
        this.number = number;
        this.state = state;
        this.score = score;
    }

    @Override
    public int appoint() {
        this.index = this.score;
        return index;
    }
}
