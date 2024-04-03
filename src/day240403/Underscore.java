package day240403;

public class Underscore {
    public static void main(String[] args) {

        // 会议号
        int meetingNumber = 496_870_916;
        // 电话号码: 15980768969

        /**
         * Using Underscore Characters in Numeric Literals
         * 在数字字面量中使用下划线字符
         *
         *
         * In Java SE 7 and later, any number of underscore characters (_) can appear anywhere between digits in a numerical literal.
         *   This feature enables you, for example:
         *     to separate groups of digits in numeric literals, which can improve the readability of your code.
         * 在 Java SE 7 及更高版本中，任意数量的下划线字符(_)可以出现在数字字面量中数字之间的任意位置。
         *   此功能使您能够，例如：
         *     以分隔数字字面量中的数字组，这可以提高代码的可读性。
         *
         *
         * For instance, if your code contains numbers with many digits,
         *   you can use an underscore character to separate digits in groups of three,
         *     similar to how you would use a punctuation mark like a comma, or a space, as a separator.
         * 例如，如果代码包含许多数组成的数值，
         *   则可以使用下划线字符将数字分隔为三组，
         *     类似于使用逗号或空格等标点符号作为分隔符。
         *
         */
             // --------
        // 不能再小数点前后
        // float pi1 = 3_.1415F;
        // float pi2 = 3._1415F;

        //不能在L前
        //long socialSecurityNumber1 = 999_99_9999_L;

        //可以
        //int x1 = 5_2;

        //不可以在数字末尾
        //int x2 = 52_;

        //可以多个__________
        //int x3 = 5_________2;

    }
}
