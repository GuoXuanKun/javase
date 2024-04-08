package day240408;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindMonthDay {
    public static void main(String[] args) {

        //用户输入年、月
        System.out.println("请输入年份");
        Scanner scanner1 = new Scanner(System.in);
        int year = scanner1.nextInt();
        System.out.println("请输入月份");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

//        //进行日期判断
//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
//            System.out.println("本月天数为: 31" );
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            System.out.println("本月天数为: 30" );
//        }else {
//            //不考虑闰年的情况
////            System.out.println("本月天数为: 28" );
//
//            //判断是否为闰年
//            if(year % 4 == 0 ){
//                if(year % 100 == 0 && year % 400 == 0){
//                    System.out.println("本月天数为: 29" );
//                }else if(year %100 != 0) {
//                    System.out.println("本月天数为: 29" );
//                }else{
//                    System.out.println("本月天数为: 28" );
//                }
//            }else {
//                System.out.println("本月天数为: 28" );
//            }
//
//        }

        int day;
        switch (month){
            case 1,3,5,7,8,10,12:
                day = 31;
                break;

            case 4,6,9,11:
                day = 30;
                break;

            case 2:
                day = 28;
                break;
        }
        System.out.println();
    }
}
