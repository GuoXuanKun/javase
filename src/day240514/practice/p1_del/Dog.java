package day240514.practice.p1_del;

public class Dog implements MyComparable {
    String name;
    int age;

    public Dog(String name, int age) {
        /*// 具体子类中，哪个 state 要参与比较，该用通过 super(xxx) 的调用方式给它赋值
        super(age);*/
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(MyComparable s) {
        if (s instanceof Dog other) {
            if (this.age == other.age) {
                return 0;
            } else if (this.age > other.age) {
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
