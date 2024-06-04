package day240604.practice.me;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args){
        m1();
        m2();
        m3();
        m4();
        m5();
        m6();
    }

    private static void m1() {
        System.out.println("abc".matches("..."));
    }

    private static void m2() {
        // 18999999987
        // 1899****987
        System.out.println("x9876z".replaceAll("\\d", "-"));
    }

    private static void m3() {
        Pattern pattern = Pattern.compile("[0-9]{3}");
        Matcher matcher = pattern.matcher("168");
        System.out.println(matcher.matches());
    }

    private static void m4() {
        System.out.println("168".matches("[0-9]{3}"));
    }

    private static void m5() {
        System.out.println("https://regexlearn.com/zh-cn/learn/regex101");
    }

    private static void m6() {
        String text = "一堆EP01_2024060400abc.mp4";

        Pattern p = Pattern.compile(".*(EP\\d{2})_.*(\\.mp4)");

        Matcher m = p.matcher(text);

        System.out.println(m.matches());
        System.out.println(m.group(1));
        System.out.println(m.group(2));
        if (m.matches()) {
            System.out.println(m.group(1) + m.group(2));
        }
    }
}
