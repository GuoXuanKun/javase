package day240429.practice.p2;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        // 思考:
        // Animal animal = cat;
        // 引出直接打印 char[] 竟然不是我们预想的 '地址值'
//        Animal animal = cat;
        cat.testInstanceMethod();
        Animal animal = cat;
        animal.testInstanceMethod();
//        animal.eat();
    }
}
