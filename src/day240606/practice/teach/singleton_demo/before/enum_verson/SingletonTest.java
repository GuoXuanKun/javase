package day240606.practice.teach.singleton_demo.before.enum_verson;

public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Student.INSTANCE);
        }

        Student student1 = Student.INSTANCE;
        Student student2 = Student.INSTANCE;
        System.out.println(student1 == student2);
    }
}