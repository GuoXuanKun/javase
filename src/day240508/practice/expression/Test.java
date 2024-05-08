package day240508.practice.expression;

import day240430.practice.xxx.Student;

public class Test {
    public static void main(String[] args) {
        day240430.practice.xxx.Student yh = new day240430.practice.xxx.Student("yh");
        yh.describeLonely("我不孤独");
        yh.judgeXDD("SB");

        day240430.practice.xxx.Student lin = new day240430.practice.xxx.Student("lin");
        lin.describeLonely("一个人做。。。");
        lin.judgeXDD("DSB");

        day240430.practice.xxx.Student jl = new Student("jl");
        jl.describeLonely("我是社牛");
        jl.judgeXDD("Fuc...");
    }
}
