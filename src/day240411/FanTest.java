package day240411;

public class FanTest {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.name = "美的";
        fan.color = "黑";
        fan.kind = "落地扇";

        System.out.println("name: " + fan.name + " color: " + fan.color + " kind: " + fan.kind );

        fan.voltage1();
        fan.voltage2();
        fan.voltage3();

    }

}
