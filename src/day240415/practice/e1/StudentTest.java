package day240415.practice.e1;

public class StudentTest {
    public static void main(String[] args) {
        // 配合之前的截图...

        // In OOP, we create objects to solve complex problems.
        // 这次的问题，主要“学生”，看题目，需要20个学生对象objects

        // A class is a blueprint or prototype form which objects are created.
        // Declaring Classes
        // 1. state
        // 2. behavior
        // 3. constructor

        // 变量类型 变量名 = 变量值;
        /*Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);*/
        // DRY
        Student[] students = new Student[20];
        for (int i = 1; i <= 20; i++) {
            // 变量类型 变量名 = 变量值;
            Student student = new Student(i);
            students[i-1] = student;
        }

        // 问题0: 输出现在创建出来的20个学生的信息
        //System.out.println("学号="+students[0].number+"，年级="+students[0].state+"，分数="+students[0].score);
        //students[0].你把自己给我打印出来
        //students[0].show();
        // 如果你不止要输出一个，repeat => loop
        for (int i = 0; i < students.length; i++) {
            // 问题1：只输出2年级的学生。 =》 分支 branch
            if (students[i].state == 2) {
                students[i].show();
            }
        }

        System.out.println("=== === ===");

        System.out.println("排序之前：");
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }

        // 问题二：冒泡法排序学生，根据学生的成绩
        // 进行排序
        // === === === 下面这段算法，之前写过，你可以直接 copy 过来，然后做对应的修改就好
        // 引出：git commit 消息，最好要准确的描述出当前为什么做那次提交，比如：冒泡法排序
        //      不能每一次 commit 提交，都写：（第一次提交，第二次提交，提交提交...），避免过了一段时间你完全不知道那会儿在干嘛，实际上：变成了垃圾
        // 以我写这段代码为例：通过搜索“Bubble”准确的找出当时我是在：4/10/24 at 5:24 PM 提交的代码
        for (int i = 0; i < students.length - 1; i++) {
            boolean swapped = false; // <===
            for (int j = 0; j < (students.length - 1) - i; j++) {
                if (students[j].score > students[j+1].score) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                    swapped = true; // <===
                }
            }
            if (!swapped) { // <===
                break; // <===
            } // <===
        }
        // === === ===

        // 排序之后
        System.out.println("排序之后：");
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }
    }
}
