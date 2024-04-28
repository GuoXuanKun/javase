package day240428.practice.controlled_experiment_of_override;

public class Girl extends Person{
    @Override
//    public void eat() {
//        System.out.println("女生也要吃饭");
//    }

    // 更改 访问权限修饰符
    // 报错 内容为: 正在尝试分配更低的访问权限; 以前为public
//     void eat(){
//        System.out.println("女生也要吃饭 no modified");
//    }

    // 更改返回类型
    // 报错 内容为: attempting to use incompatible return type 返回类型java.lang.String与void不兼容
//        public String eat() {
//        System.out.println("女生也要吃饭");
//        return "女生也要吃饭";
//    }

    // 更改方法名
//    public void eae(){
//        System.out.println("女生也要吃饭");
//    }

    // 更改参数类型列表
//    public void eat(int a){
//        System.out.println("女生也要吃饭");
//    }

}
