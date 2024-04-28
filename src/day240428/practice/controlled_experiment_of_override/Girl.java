package day240428.practice.controlled_experiment_of_override;

public class Girl extends Person{
    @Override
//    public void eat() {
//        System.out.println("女生也要吃饭");
//    }

    // 更改 访问权限修饰符
    // 报错内容为: 正在尝试分配更低的访问权限; 以前为public
     void eat(){
        System.out.println("女生也要吃饭 no modified");
    }
}
