package day240428.practice.question;

public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy();
        System.out.println(boy.getClass().getSuperclass().getName());

        Girl girl = new Girl();
        System.out.println(girl.getMyClass().getMyClassName());

        Boy boy2 = new Boy();
        boy2.setId("789");
        boy2.setSchool("清华");
    }
}
