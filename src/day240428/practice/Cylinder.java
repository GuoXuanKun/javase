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
        return this.getRadius() * this.getRadius() * length;
    }

    // constructor

    public Cylinder() {
    }


}
