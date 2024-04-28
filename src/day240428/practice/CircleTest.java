package day240428.practice;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();

        circle.setRadius(6.6);
        System.out.println(circle.findArea());

        cylinder.setRadius(6.6);
        cylinder.setLength(5.0);
        System.out.println(cylinder.findVolume());
    }
}
