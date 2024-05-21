package day240521.practice.teacher.group;

public class Test {
    public static void main(String[] args) {
        Group<String, String> group1 = new Group<>("第一组", "4人");
        group1.set("第一组", "5人");
        System.out.println(group1.get("第一组"));

        System.out.println("=== === ===");

        m2();
    }

    private static void m2() {
        Group<String, Integer> group1 = new Group<>("第一组", 4);
        group1.set("第一组", 5);
        System.out.println(group1.get("第一组"));
    }
}
