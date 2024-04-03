package day240403;

public class DataTypes1 {
    public static void main(String[] args) {
        //Literals 字面量

        byte from = 12;
        byte to = -128;

        System.out.println(to);

        short size = 128;

        int commonUse = 1234;

        //Integer number too large
        //long big = 34142346546446;
        long big = 34142346546446L;

        //=============================

        //浮点型
        double doubleVar = 128.8;

        //F/f
        //float floatVar = 18.8;
        float floatVar = 18.8F;

        //================================

        //'' & one char
        char c1 = 'a';

        //Too many characters in character literal 字符字面中的字符太多
        //c1 = 'AB'
        System.out.println(c1);

        char c2 = '8';
        char c3 = '好';
        char c4 = 'Q';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        //转义字符
        char c5 = '\n';//换行符
        c5 = '\t';//制表符
        System.out.println("Hello" + c5);
        System.out.println("World");

    }
}
