package day240514.practice.p1;

public class Student implements Comparable {
    String name;
    int score;

    public Student(String name, int score) {
        /*// 具体子类中，哪个 state 要参与比较，该用通过 super(xxx) 的调用方式给它赋值
        super(score);*/
        this.name = name;
        this.score = score;
        // 具体的子类中，哪个 state 要参与比较，就把它赋值给从父类基础的那个 xxx
//        this.xxx = this.score;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.score + ")";
    }

    @Override
    public int compareTo(Object s) {
        if (s instanceof Student) {
            Student other = (Student) s;
            if (this.score == other.score) {
                return 0;
            } if (this.score > other.score) {
                return 1;
            } else {
                return -1;
            }
        } else {
            // 后续学了异常之后，这里可以抛出异常
            System.out.println("类型不匹配");
            return -999;
        }
    }
}
