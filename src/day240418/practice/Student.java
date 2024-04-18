package day240418.practice;

public class Student {
    // 1. state
    int id;
    String name;

    // 3. constructor
    private Student(){

    }

    // 2. behavior
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 提供 实例化方法
    public static void instantiation(){
        Student student = new Student();
        System.out.println(student);
    }

}
