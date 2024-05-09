package day240509.practice.final_test;

public class FinalDemo {
//    Variable 'id' might not have been initialized
//    变量“id”可能尚未初始化
//    final int id;


    // position 1
    final int id;

//    {
    // position 2
//        id = 1;
//    }

    // position 3
    public FinalDemo() {
        id = 1;
    }

    public void test() {
        final int iu;
        iu = 1;
        System.out.println(iu);
    }

    public void test1(final int id) {
//        Cannot assign a value to final variable 'id'
//        不能给最终变量“id”赋值
//        id = 1;
        int iu = id;
        System.out.println(iu);
        final int in = id;
        System.out.println(in);
    }

}
