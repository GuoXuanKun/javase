package day240523.practice.me.find_string_count;

public class FindStringCount {
    // 想法:
    // 1. 拆成数组进行对比
    // 2. C 语言 有 kmp 算法 ,Java 会不会也有
    public static void main(String[] args) {
        String s = "sb";
        String content = "acusbikmnesbciouinsbeik123dsb9";
        int count = 0;
        char[] c = s.toCharArray();
        char[] d = content.toCharArray();
//        方法1 : 拆成 char 数组 进行循环对比
        for (int i = 0; i < d.length; i++) {
            if (d[i] == c[0] && d[i + 1] == c[1]) {
                ++count;
            }
        }
        System.out.println("'sb' 出现了 " + count + " 次" );
//        方法2 : Java 没有 KMP 算法 那就自己照着 C 写 KMP 算法
        KMPTest.KMP(d,c);
    }
}
