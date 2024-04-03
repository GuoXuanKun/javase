package day240403;

public class Table99 {
    public static void main(String[] args) {
        // step 1 找核心，把眼镜摘了
        /*
        System.out.println("1 * 1 = 1");
        */

        // step 2 聚焦，行, repeat 9 -> for
        /*for (int i = 1; i <= 9; i++) {
            System.out.println("1 * 1 = 1");
        }*/

        // step 3 还原细节，其中一个乘数要动态变化
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println("1 * " + i + " = 1");
            }
        }*/

        // step 4-5 完善细节 + 修正（每行换一次，println -> print）
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print("1 * " + i + " = 1  ");
            }
            System.out.println();
        }*/

        // step 6 找规律
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1 * " + i + " = 1  ");
            }
            System.out.println();
        }*/

        // step 7 还原细节，另一个乘数也要动态，正好跟列一致
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = 1  ");
            }
            System.out.println();
        }*/

        // step 8 继续还原细节，乘积也要动态变化
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "  ");
            }
            System.out.println();
        }*/

        // step 9 优化细节
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }*/
    }
}
