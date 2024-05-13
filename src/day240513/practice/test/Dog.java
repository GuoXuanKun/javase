package day240513.practice.test;

public class Dog extends Sortable {
    String name;
    int age;

    public Dog(String name, int age) {
        /*// 具体子类中，哪个 state 要参与比较，该用通过 super(xxx) 的调用方式给它赋值
        super(age);*/
        this.name = name;
        this.age = age;
        // 具体的子类中，哪个 state 要参与比较，就把它赋值给从父类基础的那个 xxx
//        this.xxx = this.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean isLargerThan(Sortable s) {
        // 严格来说，这里要进行 instanceof 判断，确定了传进来的是 Dog 类型，才能强制转成 Dog
        Dog other = (Dog) s;
        if (this.age > other.age) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getXxx() {
        // 具体子类中，哪个 state 要参与比较，就通过这个方法返回出去
        return this.age;
    }
}
