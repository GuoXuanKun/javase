package day240411;

public class Phone {
    // state 状态 用变量表示
    String name;
    String color;
    String size;
    String weight;

    // behavior 行为 用方法表示
    public void call(){
        System.out.println("打电话");
    }

    public void play(){
        System.out.println("玩游戏");
    }

    public void find(){
        System.out.println("找资料");
    }

    public void music(){
        System.out.println("听音乐");
    }
}
