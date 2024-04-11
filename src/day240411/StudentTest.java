package day240411;

public class StudentTest {
    public static void main(String[] args) {
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
    }
}
