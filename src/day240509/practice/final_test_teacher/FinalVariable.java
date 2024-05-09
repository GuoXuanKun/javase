package day240509.practice.final_test_teacher;

public class FinalVariable {
    // Variable 'id' might not have been initialized
    final int id;
    final static int AGE;

    public FinalVariable() {
        System.out.println("执行了 `空参构造器`");
        //id = 1;
    }
//
//    public FinalVariable(int id) {
//        this.id = id;
//    }

    {
        System.out.println("执行了 `block`");
        id = 3;
    }

    static {
        AGE = 19;
    }

    public void localVariableWithFinalTest() {
        final int a = 0;
        // Cannot assign a value to final variable 'a'
        //a = 3;
    }

    public void parameterWithFinalTest1(final int i) {
        //i++;
    }

    public void parameterWithFinalTest2(final MyClass myClass) {
        //myClass.i++; // 可以，没有改变 myClass 的值（地址）
        //myClass = new MyClass(); // 不行，改变 myClass 的值（地址）
    }
}

class MyClass {
    int i;
}