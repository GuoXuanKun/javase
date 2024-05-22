package day240522.practice.teacher.string.interview;

@SuppressWarnings("all")
public class Q3 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "2403";

        String s3 = "Java2403";

        String s4 = "Java" + "2403";
        String s5 = s1 + "2403";
        String s6 = "Java" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4); // true
        System.out.println(s3 == s5); // false
        System.out.println(s3 == s6); // false
        System.out.println(s3 == s7); // false
        System.out.println(s5 == s6); // false
        System.out.println(s6 == s7); // false

        String s8 = s6.intern();
        System.out.println(s3 == s8); // true
    }
}
