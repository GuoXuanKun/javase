package day240417.practice;

public class VarargsDetail {
    public static void main(String[] args) {
        // int... 与 int[] 有区别 . int... 可以传递空参数
//        demo1();
    }

        // personal: 不会出错
        public static void demo1 ( int a){
        }

        // personal: 不会出错
//        public static void demo1 ( int[] is){
//        }

        // personal: 不会出错
        // reality: int... 的本质,或者说JVM底层就是把它当成数组来处理的
        // 跟上一个方法的签名一致, 就是重名了 , 所以会报错
//        public static void demo1 ( int...is){
//        }

        // personal: 会出错
        // reality: 不会出错
        //
//        public static void demo2 ( int type, int c, int...is){
//        }

        // personal: 会出错
        // 变长数组不能放在前面
        // reality: Vararg parameter must be the last in the list
        // 新知识 可变类型的参数,必须出现在参数列表的最后一个位置
//        public static void demo3 ( int...is,int type, int c){
//        }

        // personal: 会出错
        // reality: 不会出错
//        public static void demo4 (String type,char c, int...is){
//        }

        // personal: 不会出错
        // reality: 会出错
        // 跟类型无关, 可变类型的参数,必须出现在参数列表的最后一个位置
//        public static void demo5 ( int...is, String type,char c){
//        }

        // personal: 会出错
        // 变长数组不能放在前面
        // 这个可以用反证法:假设可以有两个可变类型参数，那第一个参数肯定无法满足可变长度参数的规则:
//        public static void demo6 ( int...is1,int...is2){
//        }
    }

