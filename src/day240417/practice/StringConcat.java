package day240417.practice;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {

        System.out.println(concat("Hello","World"));
        System.out.println(concat("Hello","国贸","class8"));
        System.out.println(concat());

        // 需求二 :让用户输入 args[]

        System.out.println(concat(args));

        // 新需求 让用户输入分隔符
        System.out.println("请输入分隔符");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        System.out.println(concat(args,string));

    }

    public static String concat(String... arr){
        if (arr.length==0){
            return "  ";
        }else {
            String string = " ";
        for (int i = 0; i < arr.length - 1; i++) {
           string += arr[i] + "-=";
        }
        return string + arr[arr.length-1];
    }
    }

    // 新需求 由用户输入分隔符
    public static String concat(String[] arr,String str){

            String string = " ";
            for (int i = 0; i < arr.length ; i++) {
                string += arr[i] + (i == (arr.length - 1) ? " " : str );
            }
            return string ;

    }
}
