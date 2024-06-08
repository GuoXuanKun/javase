package day240607.practice.teach.before_singleton;

public class StudentTest {
    public static void main(String[] args) {
        // 变量
        // 变量类型 变量名 = 变量值;
        // new Student() 这条语句本质上调用什么？
        //   - 构造器
        //   - 看 out 目录自动编译出来的 class 文件
        //   - 能看到在 class 文件中自动生成了 构造器
//        Student student1 = new Student();
//        System.out.println(student1);
//
//        Student student2 = new Student();
//        System.out.println(student2);
//
//        Student student3 = new Student();
//        System.out.println(student3);

        // 思考：现在外面不能直接 new 它，那可以在哪里 new ?
        //   - 思路：外面（StudentTest）不行 -> 里面（Student 本身） new 它
        //     - 里面：有哪些位置可以 new ?
        //       - 1. 在里面的 state 的位置 new 它
        //       - 2. 在里面的 behavior 的位置 new 它

        // 死结：
        // 怎么获取到在里面的 state 位置 new 出来的 Student 对象？
        // 正常情况，应该先在外部 new 出 Student 对象出来，然后才能访问里面的 state 和 behavior ...
        // 但是现在：我们在外部并不能 new 出 Student。因为构造器被保护起来

        // 回顾之前的知识：
        // Fields:
        //   - Instance Variables (Non-Static Fields)
        //   - Class Variables (Static Fields)

        // 破解死结：static
        Student student = Student.student;
        System.out.println(student);
    }
}
