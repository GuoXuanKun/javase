package day240411;

public class StudentTest {
    public static void main(String[] args) {
        /*
        Student student = new Student();
        student.name = "小芳";
        student.sex = '女';
        student.hair = "辫子粗又长" ;
        student.age = 18;

        System.out.println("学生信息: "+ student.name+ " ,"+student.sex+" ," + student.hair+" ,"+ student.age);

        Student student2 = new Student();
        student2.name = "小胖";
        student2.sex = '男';
        student2.hair = "短发";
        student2.age = 20;
        System.out.println("学生信息: "+ student2.name+ " ,"+student2.sex+" ," + student2.hair+" ,"+ student2.age);
        */

 /*       //实例化对象数组
        Student[] students = new Student[2];
        //实例化对象
        students[0] = new Student();
        students[1] = new Student();

        students[0].name = "小芳";
        students[0].sex = '女';
        students[0].hair = "辫子粗又长" ;
        students[0].age = 18;

        students[1].name = "小胖";
        students[1].sex = '男';
        students[1].hair = "短发";
        students[1].age = 20;

        for (int i = 0; i < students.length; i++) {
            System.out.println("学生信息: "+ students[i].name+ " ,"+students[i].sex+" ," + students[i].hair+" ,"+ students[i].age);
        }*/

        // 实例化一只狗子
        Dog dog = new Dog();
        dog.name = "小白";
        dog.variety = "贵宾犬";

//        System.out.println("狗子信息: "+ dog.name + dog.variety);

        // 实例化一群狗子
        Dog[] dogs = new Dog[2];
        dogs[0] = dog;
        dogs[1] = new Dog();

        dogs[1].name = "小黑";
        dogs[1].variety = "牧羊犬";

        for (int i = 0; i < dogs.length; i++) {
            System.out.println("狗子信息: "+ dogs[i].name+"," + dogs[i].variety);
        }

        Student student = new Student();
        student.name = "小芳";
        student.sex = '女';
        student.hair = "辫子粗又长" ;
        student.age = 18;

        student.dogs = new Dog[2];
        student.dogs[0] = new Dog();
        student.dogs[1] = new Dog();

        student.dogs[0].name = "小白";
        student.dogs[0].variety = "贵宾犬";
        student.dogs[1].name = "小黑";
        student.dogs[1].variety = "牧羊犬";
        System.out.println("学生信息: "+ student.name+ " ,"+student.sex+" ," + student.hair+" ,"+ student.age);

        for (int i = 0; i < student.dogs.length; i++) {
            System.out.println("狗子信息: "+ student.dogs[i].name+"," + student.dogs[i].variety);
        }
    }
}
