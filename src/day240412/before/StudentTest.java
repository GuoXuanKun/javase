package day240412.before;

public class StudentTest {
    public static void main(String[] args) {
        // 一个学生
        Student student1 = new Student();
        student1.name = "小芳";
        student1.sex = '女';
        student1.hair = "辫子粗又长";
        student1.age = 18;


        // 狗1
        Dog dog1 = new Dog();
        dog1.name = "小白";
        dog1.type = "贵宾犬";

        // 狗2
        Dog dog2 = new Dog();
        dog2.name = "小黑";
        dog2.type = "牧羊犬";

        // 狗狗们
        Dog[] dogs = new Dog[2];
        dogs[0] = dog1;
        dogs[1] = dog2;

        student1.dogs = dogs;

        student1.show();
//        System.out.println("学生1基础信息：" + student1.name + "，" + student1.sex + "，" + student1.hair + "，" + student1.age+ "，" + student1.dogs);
//
//        System.out.println("学生1的狗狗们：");
//        System.out.println("第一只狗的姓名：" + student1.dogs[0].name + ", 品种：" + student1.dogs[0].type);
//        System.out.println("第二只狗的姓名：" + student1.dogs[1].name + ", 品种：" + student1.dogs[1].type);

//        System.out.println("=== === ===");
//
//        for (int i = 0; i < student1.dogs.length; i++) {
//            System.out.println("第" + (i+1) + "只狗的姓名：" + student1.dogs[i].name + ", 品种：" + student1.dogs[i].type);
//        }
    }
}
