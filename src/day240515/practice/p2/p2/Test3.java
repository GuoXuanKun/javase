package day240515.practice.p2.p2;

public class Test3 {
    public static void main(String[] args) {
        int[] intArr = new int[] {3, 5, 1, 2, 9};
        // In OOP, we create objects to solve complex problems.
        // 自己创建：MyInt
        //MyInt[] myIntArr = new MyInt[] {new MyInt(3), new MyInt(5), new MyInt(1), new MyInt(2), new MyInt(9)};
        // JDK：Integer
        Integer[] integerArr = new Integer[] {new Integer(3), new Integer(5), new Integer(1), new Integer(2), new Integer(9)};
    }
}
