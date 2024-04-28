package day240428.practice;

public class Circle {
    // state
    // 半径
    private double radius;

    // behavior
    public Circle() {

    }

    // behavior
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 计算面积
    public double findArea(){
        System.out.print("圆的面积为: ");
        return radius * radius * Math.PI;
    }
}
