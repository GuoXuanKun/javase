package day240513.practice.test;

public class Student extends MyComparable {
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
    public boolean compareTo(MyComparable s) {
        if (s instanceof Student) {
            Student other = (Student) s;
            if (this.score > other.score) {
                return true;
            } else {
                return false;
            }
        } else {
            // 后续学了异常之后，这里可以抛出异常
            System.out.println("类型不匹配");
            return false;
        }
    }

    @Override
    public double getXxx() {
        // 具体子类中，哪个 state 要参与比较，就通过这个方法返回出去
        return this.score;
    }
}
