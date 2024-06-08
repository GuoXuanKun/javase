package day240607.practice.teach.before_singleton;

public class StudentTest {
    public static void main(String[] args) {
        // 变量
        // 变量类型 变量名 = 变量值;
        // new Student() 这条语句本质上调用什么？
        //   - 构造器
        //   - 看 out 目录自动编译出来的 class 文件
        //   - 能看到在 class 文件中自动生成了 构造器
        Student student1 = new Student();
        System.out.println(student1);
    }
}
