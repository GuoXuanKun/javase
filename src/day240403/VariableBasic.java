package day240403;

public class VariableBasic {
    public static void main(String[] args) {
        // 数据类型 变量名 = 变量值
        int count = 2 ;
        //变量的使用
        System.out.println(count);

        //Cannot resolve symbol 'size'
        //无法解析符号“size”
        //System.out.println(size);

        //变量的声明
        int size;
        // Variable 'size' might not have been initialized
        //变量'size'可能尚未初始化
       // System.out.println(size);
        //变量的赋值
        size = 1001;


        //Variable 'size' is already defined in the scope
        //变量'size'已经在作用域中定义
        //int size = 22;

    }

    public static void otherMethod(){

        //Cannot resolve symbol 'count'
        //无法解析符号'count'
        //System.out.println(count);

        int size = 22;
    }
}
