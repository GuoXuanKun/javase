package day240417.practice;

public class VarargsDetail {
    public static void main(String[] args) {

        // personal: 不会出错
//    public static void demo1(int a) {}

        // personal: 不会出错
//    public static void demo1(int[] is) {}

        // personal: 不会出错
//    public static void demo1(int... is) {}

        // personal: 会出错
        // 变长数组不能放在后面
//    public static void demo2(int type, int c, int... is) {}

        // personal: 会出错
        // 变长数组不能放在后面
//    public static void demo3(int... is, int type, int c) {}

        // personal: 会出错
        // 变长数组不能放在后面
//    public static void demo4(String type, char c, int... is) {}

        // personal: 不会出错
//    public static void demo5(int... is, String type, char c) {}

        // personal: 会出错
        // 变长数组不能放在后面
//    public static void demo6(int... is1, int... is2) {}
    }
}
