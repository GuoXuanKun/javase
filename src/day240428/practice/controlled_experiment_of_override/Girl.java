package day240428.practice.controlled_experiment_of_override;

public class Girl extends Person{
    @Override
//    public void eat() {
//        System.out.println("女生也要吃饭");
//    }

//    // 更改 访问权限修饰符
//    // 报错 内容为: 正在尝试分配更低的访问权限; 以前为public
//     void eat(){
//        System.out.println("女生也要吃饭 no modified");
//    }
//
//    // 更改返回类型
//    // 报错 内容为: attempting to use incompatible return type 返回类型java.lang.String与void不兼容
//        public String eat() {
//        System.out.println("女生也要吃饭");
//        return "女生也要吃饭";
//    }
//
//    // 更改方法名
//    public void eae(){
//        System.out.println("女生也要吃饭");
//    }
//
//    // 更改参数类型列表
//    public void eat(int a){
//        System.out.println("女生也要吃饭");
//    }
//
//    // 更改方法体
//        public void eat() {
//        System.out.println("女生当然也要吃饭");
//    }

    // 方法名 (形参列表)
//        public void eat() {
////        System.out.println("女生也要吃饭");
//    }

    // modifier 权限修饰符
//    public void eat(){
//
//    }

    // 子类重写的方法权限修饰符不小于父类被重写的方法的权限修饰符
//    void eat(){
//
//    }

    // 子类不能重写父类中声明为 private 权限修饰的方法
//    private void eat(){}

    // 父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型必须是void
//    public void eat(){
//
//    }

    // 报错 内容为: attempting to use incompatible return type
    // 父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型必须是void
//    public int eat(){
//        return 1;
//    }

//    // 非 void
//    public String drink(){
//        System.out.println("女生喝水");
//        return "女生喝水";
//    }
//
//    // 父类被重写的方法的返回值类型是基本数据类型，则子类重写的方法的返回值类型必须与被重写的方法的返回值类型相同
//    public void drink(){
//
//    }

//       返回类型之引用类型
    // 父类被重写的方法的返回值类型是引用数据类型(比如类)，则子类重写的方法的返回值类型可以与被重写的方法的返回值类型相同 或 是被重写的方法的返回值类型的子类
    public Person personal(){
        return null;
    }

    public Boy personal(){
        return null;
    }

    public Girl personal(){
        return null;
    }
}
