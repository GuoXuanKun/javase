package day240522.practice.teacher.string.interview;

public class StringCommonMethods {
    public static void main(String[] args) {
        String code = "abcxyz";
        System.out.println(code);
        String codeUpperCase = code.toUpperCase(); // ABCXYZ
        System.out.println(codeUpperCase);
        System.out.println(code.equals(codeUpperCase));
        System.out.println(code.equalsIgnoreCase(codeUpperCase));
        System.out.println(code.length());
        System.out.println(code.endsWith("z"));
        System.out.println(code.startsWith("a"));
        String str = "  qwer   ";
        System.out.println(str);
        System.out.println(str.trim());
    }
}
