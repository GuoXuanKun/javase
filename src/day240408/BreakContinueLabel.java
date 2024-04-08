package day240408;

import javax.swing.*;

public class BreakContinueLabel {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//        System.out.println("=== === ===");
//
//        //碰到4 跳过 不打印
//        for (int i = 1; i <= 5; i++) {
//            if (i == 4){
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        System.out.println("=== === ===");
//
//        //碰到4 停止打印 i==5不执行
//        for (int i = 1; i <= 5; i++) {
//            if (i == 4){
//                break;
//            }
//            System.out.println(i);
//        }
//
//        System.out.println("=== === ===");
//
//        //多重循环 上个需求执行3次
//        for (int j = 0; j < 3; j++) {
//            for (int i = 1; i <= 5; i++) {
//                if (i == 4){
//                    break;
//                }
//                System.out.println(i);
//            }
//        }
//        System.out.println("=== === ===");

        //多重循环 break 结束外层for循环
        label:for (int j = 0; j < 3; j++) {
            for (int i = 1; i <= 5; i++) {
                if (i == 4){
                    break label;
                }
                System.out.println(i);
            }
            System.out.println("===");
        }

    }
}
