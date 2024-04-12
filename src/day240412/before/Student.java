package day240412.before;

public class Student {
    public Object show;
    String name;
    char sex;
    String hair;
    int age;

    Dog[] dogs;


    public void show() {
        System.out.println("name: " + name + " sex: " + sex + " hair: " + hair + " age: " + age );

        if( dogs == null){
            System.out.println("还没有狗子");
        }else {
            System.out.println("学生的狗狗: ");
            for (int i = 0; i < dogs.length; i++) {
                System.out.println("第"+ (i+1) + "只狗的姓名: " + dogs[i].name + " 品种: " + dogs[i].type);
            }
        }
    }
}
