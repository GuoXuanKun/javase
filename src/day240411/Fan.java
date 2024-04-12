package day240411;

public class Fan {
    // state 状态
    String name;
    String color;

    String kind;

    public void voltage1(){
        System.out.println("一档风");
    }

    public void voltage2(){
        System.out.println("二档风");
    }

    public void voltage3(){
        System.out.println("三档风");
    }
    public void shake(){
        System.out.println("摇头");
    }
    public void noShake(){
        System.out.println("固定,不摇头");
    }
}
