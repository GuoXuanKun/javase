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
}
