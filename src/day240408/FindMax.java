package day240408;

public class FindMax {
    public static void main(String[] args) {
        int x = 8;
        int y = 9;

//      method 1
//        if (x > y){
//            System.out.println("最大数是: " + x);
//        } else if ( x < y) {
//            System.out.println("最大数是: " + y);
//        }else {
//            System.out.println(x + " = " + y);
//        }

//      method 2
         compare(x,y);
    }

    public static void compare(int a,int b){
        if (a > b){
            System.out.println("最大数是: " + a);
        } else if ( a < b) {
            System.out.println("最大数是: " + b);
        }else {
            System.out.println(a + " = " + b);
        }
    }
}
