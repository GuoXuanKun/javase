package day240412;

public class Student {
    // state (field)
    String name;
    // 对年龄有不能为负的要求,不方便直接给用户进行操控
    private int age;

    // behavior (method)
    public void show(){
        System.out.println("姓名: " + name + " 年龄: " + age );
    }


    //给年龄提供一个外部访问的入口
    public void setAge(int age) {
        if(age < 0){
            System.out.println("你再考虑一下");
            age =  0;
            System.exit(0);
        }else {
            age = age;
        }

    }
}
