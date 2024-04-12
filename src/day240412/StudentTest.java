package day240412;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "小庄";

        //因为年龄是私有的,不能直接问,只能通过提供的方法问
        student.setAge(-2);

        student.show();
    }

}
