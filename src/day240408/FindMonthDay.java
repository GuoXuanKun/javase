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

        //进行日期判断
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("本月天数为: 31" );
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("本月天数为: 30" );
        }else {
            //不考虑闰年的情况
            System.out.println("本月天数为: 28" );
        }

    }
}
