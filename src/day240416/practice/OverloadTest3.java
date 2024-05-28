package day240416.practice;

public class OverloadTest3 {
    public int add(int a, int b) throws  {
        return 0;
    }

    // 第一步：回顾之前的知识，声明方法有哪几个要素（6个（暂时忽略第5个），也就是有5个需要进一步验证它们对重载的影响）

    /*
    // 第二步：
    // 1. 只有访问权限修饰符不一样，行不行
    // 'add(int, int)' is already defined in '...'
    private int add(int a, int b) {
        return 0;
    }
     */

    /*
    // 第三步：
    // 2. 只有返回值类型不一样，行不行？
    // 'add(int, int)' is already defined in '...'
    public long add(int a, int b) {
        return 0;
    }
    */


    // An exception list—to be discussed later.
}
