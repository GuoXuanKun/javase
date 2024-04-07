package day240407;

public class Table99 {
    public static void main(String[] args) {

        // step 1 找核心 (算式)
//        System.out.println("1 * 1 = 1 ");

        // step 2 聚焦 行 repeat 9 -> for
//        for (int i = 1; i < 10; i++) {
//            System.out.println("1 * 1 = 1 ");
//        }

        // step 3 还原细节,其中一个数要动态变化
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i + " * 1" + " = 1 ");
//        }

        //step 4 println -> print
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i + " * 1" + " = 1 ");
//            System.out.println();
//        }

        //step 5  继续还原细节,除了行还有列
//        for (int i = 1; i < 10; i++) {
//            System.out.print(i + " * 1" + " = 1 ");
//            System.out.print(i + " * 1" + " = 1 ");
//            System.out.print(i + " * 1" + " = 1 ");
//            System.out.print(i + " * 1" + " = 1 ");
//            System.out.print(i + " * 1" + " = 1 ");
//            System.out.print(i + " * 1" + " = 1 ");
//            System.out.print(i + " * 1" + " = 1 ");
//            System.out.print(i + " * 1" + " = 1 ");
//            System.out.print(i + " * 1" + " = 1 ");

//            System.out.println();
//        }

        // step 6 列 repeat 9 -> for
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.print(i + " * 1" + " = 1 ");
//            }
//
//            System.out.println();
//        }

//        step 7 列,继续还原细节,规律:第一个乘数要动态变化
//          for (int i = 1; i < 10; i++) {
//              for (int j = 1; j < 10; j++) {
//                  System.out.print(i + " * " + j + " = 1 ");
//              }
//
//            System.out.println();
//        }

        //step 8 找规律并不是没行都有 9 列
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " * " + j + " = 1 ");
//            }
//            System.out.println();
//        }

        // step 9 继续还原细节 ,成积也要动态变化
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " * " + j + " = " + i*j);
//            }
//            System.out.println();
//        }

        // step 10 继续优化细节
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + i*j + "\t");
            }
            System.out.println();
        }
    }
}
