package day240418.practice;

public class StudentTest {
    public static void main(String[] args) {
//        Student student = new Student();
//        Student.instantiation();
//        Student.instantiation();

        Student student = Student.instantiation();
        System.out.println("通过behavior实例化: " + student);
        Student student1 = Student.instantiation();
        System.out.println("通过behavior实例化: " + student1);


        //通过 state 进行实例化
/*

        Student student1 = Student.istance;
        System.out.println(student1);
        Student student2 = Student.istance;
        System.out.println(student2);
*/

    }
}
