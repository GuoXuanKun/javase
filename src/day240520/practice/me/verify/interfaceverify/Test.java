package day240520.practice.me.verify.interfaceverify;

public interface Test {
    //    Variable 'value' might not have been initialized
    // 变量“value”可能尚未初始化
    int value = 0;

    public abstract void test();
    // 方法不能是静态的
    public  void test1(int a);
}
