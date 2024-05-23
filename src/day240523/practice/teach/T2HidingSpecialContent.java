package day240523.practice.teach;

/**
 * 练习2：支持让用户输入手机号码，最终显示的时候隐藏中间四位
 * 如：用户输入 18887654321，最终显示 188****4321
 */
public class T2HidingSpecialContent {
    public static void main(String[] args) {
        String s = "18887654321";
        System.out.println(s.substring(0, 3) + "****" + s.substring(7));
    }
}
