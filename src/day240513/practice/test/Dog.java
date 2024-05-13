package day240513.practice.test;

public class Dog implements Comparable {
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
    public int compareTo(Object s) {
        if (s instanceof Dog) {
            Dog other = (Dog) s;
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
