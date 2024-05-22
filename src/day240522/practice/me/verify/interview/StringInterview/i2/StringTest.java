package day240522.practice.me.verify.interview.StringInterview.i2;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "2403";
        String s3 = "Java2403";
        String s4 = "Java" + "2403";
        String s5 = s1 + "2403";
        String s6 = "Java" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);
        System.out.println(s6 == s7);
    }
}
