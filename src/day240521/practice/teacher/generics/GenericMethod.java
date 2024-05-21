package day240521.practice.teacher.generics;

public class GenericMethod {
    public <T> T m1(T t) {
        return t;
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        Integer i = gm.<Integer>m1(89);
        int i2 = gm.<Integer>m1(89); // 这里也可以用 int 去接收它。参考 Wrapper class
        String string = gm.<String>m1("string");
    }
}