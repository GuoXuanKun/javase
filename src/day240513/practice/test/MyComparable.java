package day240513.practice.test;

public abstract class MyComparable {
    // 变量类型 变量名 = 变量值;
    // `变量类型` 好像不太容易确定
    //final double xxx;

    /*public Sortable(double xxx) {
        this.xxx = xxx;
    }*/

    // 这里只定义规范，具体的由各自子类实现
    public abstract boolean compareTo(MyComparable s);
    public abstract double getXxx();
}
