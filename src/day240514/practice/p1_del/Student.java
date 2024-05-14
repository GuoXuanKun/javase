package day240514.practice.p1_del;

public class Student implements MyComparable {
    String name;
    int score;

    public Student(String name, int score) {
        /*// 具体子类中，哪个 state 要参与比较，该用通过 super(xxx) 的调用方式给它赋值
        super(score);*/
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.score + ")";
    }

    @Override
    public int compareTo(MyComparable s) {
        if (s instanceof Student other) {
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
