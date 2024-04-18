package day240418.practice;

public class Student {
    // 1. state
    int id;
    String name;

    //通过 state 进行实例化
    static Student istance = new Student();

    static private Student istance1;

    // 3. constructor
    private Student(){
//        System.out.println(istance);
    }

    // 2. behavior
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 提供 实例化方法
    public static Student instantiation(){
        if(istance1 == null){
            istance1 = new Student();
        }

        return istance1;
    }

}
