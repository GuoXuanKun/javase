package day240521.practice.me.p3;

public class Java2403Test {
    public static void main(String[] args) {
        Java2403 j1 = new Java2403<>("第一组","4个人");
        System.out.println(j1);
        j1.getGroupMember("第一组");

        Java2403 j2 = new Java2403<>();
        j2.setGroupAndMenber("第二组","3个人");
        System.out.println(j2);

        Java2403 j3 = new Java2403<>();
        j3.setGroupAndMenber(3,4);
        System.out.println(j3);

        Java2403 j5 = new Java2403<>(4,new Java2403<>(6,"项目6"));
        System.out.println(j5);
    }
}
