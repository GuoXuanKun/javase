package day240430.practice.expression;

public class Person {
    // state
    String name;
    String expression;
    // behavior
    public void whatCanISay(String a ){
        // 版本1
        System.out.println("版本1:");
        System.out.println(" 很好 ");
        // 版本2
        //        if(a 判断 有没有 包含敏感词汇){
//            有,输出既定文本
//        }else{
//            没有 , 输出 a
//        }
        System.out.println("-------------------------------------------");
        System.out.println("版本2");
        int j = 1;
        String[] strings = new String[]{"不好","一般"};
        for (int i = 0; i < strings.length; i++) {
            if (a.contains(strings[i])){
                System.out.println(" 很好 ");
                 j = 0;
            }
        }
        if (j == 1){
            System.out.println(a);
        }
    }
    // constructor
    public Person(String name, String expression) {
        this.name = name;
        this.expression = expression;
        System.out.println(this.name + " 对孤独的看法是: " + this.expression);
    }
}
