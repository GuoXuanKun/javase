package day240426.practice;

public class Circle {

    // 1. state (fields , variable)
    public double r = 1.5;
    public final double pi = 3.14;

    public double area;

    // 2. behavior ( method , function)

    public double getArea() {
        area = r * r * pi;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    // 3. constructor
}
