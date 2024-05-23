package day240523.practice.teach;

@SuppressWarnings({"all"})
public class StringConcatTest {
    public static void main(String[] args) {
        concatWithString();
        System.out.println("===");
        concatWithStringBuffer();
        System.out.println("===");
        concatWithStringBuilder();
    }

    private static void concatWithString() {
        String string = "";
        System.out.println(string + "abc" + "xxz" + "123");
    }

    public static void concatWithStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abc");
        stringBuffer.append("xyz").append("123");

        System.out.println(stringBuffer);
    }

    public static void concatWithStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc").append("xyz").append("123");
        System.out.println(stringBuilder);
    }
}
