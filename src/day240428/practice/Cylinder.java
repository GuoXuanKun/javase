package day240428.practice;

public class Cylinder extends Circle{
    // state
    // 高度
    private double length;

    // behavior

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

//    计算体积
    public double findVolume(){
        System.out.print("圆柱体的体积为: ");
        return findArea() * length;
    }

    // constructor

    public Cylinder() {
    }


}
