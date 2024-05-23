package day240523.practice.me.string_test;

public class StringSplice {
    public static void main(String[] args) {
        string();
        System.out.println("===");
        stringBuffer();
        System.out.println("===");
        stringBuilder();
    }

    private static void string() {
        String string = "";
        System.out.println(string + "abc" + "xXz" + "123");
    }

    public static void stringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abc");
        stringBuffer.append("xyz").append("123");
        System.out.println(stringBuffer);
    }

    public static void stringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc").append("xyz").append("123");
        System.out.println(stringBuilder);
    }
}
