package day240417.practice;

public class StringConcat {
    public static void main(String[] args) {

        System.out.println(concat("Hello","World"));
        System.out.println(concat("Hello","国贸","class8"));
        System.out.println(concat());

        // 需求二 :让用户输入 args[]

        System.out.println(concat(args));

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

}
