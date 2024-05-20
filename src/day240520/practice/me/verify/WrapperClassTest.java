package day240520.practice.me.verify;

public class WrapperClassTest {
    public static void shortWrapperValue(short a){
        System.out.println(a);
    }
    public static void byteWrapperValue(byte a){
        System.out.println(a);
    }
    public static void integerWrapperValue(int a){
        System.out.println(a);
    }
    public static void longWrapperValue(long a){
        System.out.println(a);
    }
    public static void floatWrapperValue(float a){
        System.out.println(a);
    }
    public static void doubleWrapperValue(double a){
        System.out.println(a);
    }
    public static void characterWrapperValue(char a){
        System.out.println(a);
    }
    public static void booleanWrapperValue(boolean a){
        System.out.println(a);
    }

    public static void shortValue(Short a){
        System.out.println(a);
    }
    public static void byteValue(Byte a){
        System.out.println(a);
    }
    public static void intValue(Integer a){
        System.out.println(a);
    }
    public static void longValue(Long a){
        System.out.println(a);
    }
    public static void floatValue(Float a){
        System.out.println(a);
    }
    public static void doubleValue(Double a){
        System.out.println(a);
    }
    public static void charValue(Character a){
        System.out.println(a);
    }
    public static void booleanValue(Boolean a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Short
        Short shortWrapperValue = 1;
        short shortValue = 2;

        // Byte
        Byte byteWrapperValue = 1;
        byte byteValue = 2;

        // Interger
        Integer intWrapperValue = 1;
        int intValue = 2;

        // Long
        Long longWrapperValue = 1L;
        long longValue = 2L;

        // Float
        Float floatWrapperValue = 1.0F;
        float floatValue = 2.0F;

        // Double
        Double doubleWrapperValue = 1.0;
        double doubleValue = 2.0;

        // Character
        Character characterWrapperValue = 'A';
        char charValue = 'B';

        // Boolean
        Boolean booleanWrapperValue = true;
        boolean booleanValue = true;

        System.out.println("基础数据类型传给包装类: 装箱");
        shortValue(shortValue);
        byteValue(byteValue);
        intValue(intValue);
        longValue(longValue);
        floatValue(floatValue);
        doubleValue(doubleValue);
        charValue(charValue);
        booleanValue(booleanValue);

        System.out.println("包装类传给基础数据类型: 拆箱");
        shortWrapperValue(shortWrapperValue);
        byteWrapperValue(byteWrapperValue);
        integerWrapperValue(intWrapperValue);
        longWrapperValue(longWrapperValue);
        floatWrapperValue(floatWrapperValue);
        doubleWrapperValue(doubleWrapperValue);
        characterWrapperValue(characterWrapperValue);
        booleanWrapperValue(booleanWrapperValue);

    }
}
