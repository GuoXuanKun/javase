package day240523.practice.teach;

public class T1CountingSubstring {
    public static void main(String[] args) {
        // 练习1: 统计 s 在 content 中出现的次数次
        String s = "sb";
        String content = "acusbikmnesbciouinsbeik123dsb9";

        // 提示：indexOf ... 或其他方法
        // 没有标准答案
        System.out.println(content.indexOf(s));
        System.out.println(content.indexOf(s, 0));
        // 思路：重复执行上一行代码（让 fromIndex 不断变化）
        // 没有标准答案，可以参考课上说的几位同学的代码
        int k = 0;
        int start = 0;

        while (start <= content.length()) {
            int c = content.indexOf(s, start);
            if (c == -1) {
                break;
            } else {
                k++;
                start = c + 2;
            }
        }
        System.out.println("sb 出现了 " + k + " 次");
    }
}
