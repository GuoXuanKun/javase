package Tool;

import java.util.Scanner;

public class ArrayCompare {

    public static void main(String[] args) {
        int[] a = new int[100];
        int[] b = new int[100];
        int f = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一组数");
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个数");
            int c = scanner.nextInt();
            if (c == 666) {
                break;
            } else {
                a[i] = c;
            }
        }
        System.out.println();
        System.out.println("请输入第二组数");
        for (int i = 0; i < b.length; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个数");
            int c = scanner.nextInt();
            if (c == 666) {
                break;
            } else {
                b[i] = c;
            }
        }
        System.out.println("重复的数字有:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && a[i] != 0) {
                    System.out.print(a[i]+ "   ");
                    f += 1;
                }
            }
        }
        System.out.println("重复的数字有 " + f +" 个");
    }
}
